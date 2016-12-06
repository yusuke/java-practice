package javapractice;

import junit.framework.TestCase;

/**
 * Fib クラスのテストケース
 */
public class FibTest extends TestCase {
    /**
     * 基本動作
     */
    public void testCalc() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], Fib.calc(i + 1));

        }
    }

    /**
     * 例外ケース
     */
    public void testCalc2() {
        try {
            Fib.calc(0);
            fail("例外が投げられなかった");
        } catch (IllegalArgumentException ignored) {

        }
        try {
            Fib.calc(-1);
            fail("例外が投げられなかった");
        } catch (IllegalArgumentException ignored) {

        }
    }


}