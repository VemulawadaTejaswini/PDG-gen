import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        BigDecimal a;
        a = new BigDecimal(sc.next());
        BigDecimal b;
        b = new BigDecimal(sc.next());
        BigDecimal c;
        c = new BigDecimal(sc.next());

        final Solver solver = new Solver();
        solver.solve(a, b, c);
    }
}

class Solver {
    static final String YES = "Yes";
    static final String NO = "No";
    private static final BigDecimal SQRT_DIG = new BigDecimal(150);
    private static final BigDecimal SQRT_PRE = new BigDecimal(10).pow(SQRT_DIG.intValue());

    /**
     * Private utility method used to compute the square root of a BigDecimal.
     *
     * @author Luciano Culacciatti
     * @url http://www.codeproject.com/Tips/257031/Implementing-SqrtRoot-in-BigDecimal
     */
    private static BigDecimal sqrtNewtonRaphson(BigDecimal c, BigDecimal xn, BigDecimal precision) {
        BigDecimal fx = xn.pow(2).add(c.negate());
        BigDecimal fpx = xn.multiply(new BigDecimal(2));
        BigDecimal xn1 = fx.divide(fpx, 2 * SQRT_DIG.intValue(), RoundingMode.HALF_DOWN);
        xn1 = xn.add(xn1.negate());
        BigDecimal currentSquare = xn1.pow(2);
        BigDecimal currentPrecision = currentSquare.subtract(c);
        currentPrecision = currentPrecision.abs();
        if (currentPrecision.compareTo(precision) <= -1) {
            return xn1;
        }
        return sqrtNewtonRaphson(c, xn1, precision);
    }

    /**
     * Uses Newton Raphson to compute the square root of a BigDecimal.
     *
     * @author Luciano Culacciatti
     * @url http://www.codeproject.com/Tips/257031/Implementing-SqrtRoot-in-BigDecimal
     */
    public static BigDecimal bigSqrt(BigDecimal c) {
        return sqrtNewtonRaphson(c, new BigDecimal(1), new BigDecimal(1).divide(SQRT_PRE));
    }

    public void solve(BigDecimal a, BigDecimal b, BigDecimal c) {
        MathContext mc = new MathContext(30);

        BigDecimal diff = bigSqrt(a).add(bigSqrt(b)).subtract(bigSqrt(c));

        if (diff.abs(mc).compareTo(new BigDecimal("0.00000000000000000000000000000000001")) < 0) {
            System.out.println(NO);
        }

        if (diff.signum() < 0) {
            System.out.println(YES);
        } else {
            System.out.println(NO);
        }
    }
}

