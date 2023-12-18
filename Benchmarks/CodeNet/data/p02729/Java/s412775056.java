import java.io.InputStream;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int nCoeff = binomialCoefficient(n, 2);
        int mCoeff = binomialCoefficient(m, 2);

        if (nCoeff == 1) {
            nCoeff = 0;
        }

        if (mCoeff == 1) {
            mCoeff = 0;
        }

        System.out.println(nCoeff + mCoeff);
    }

    private static int binomialCoefficient(int n, int k) {
        int coefficient = 1;

        if (k > n - k) {
            k = n - k;
        }

        for (int i = 0; i < k; ++i) {
            coefficient *= (n - i);
            coefficient /= (i + 1);
        }

        return coefficient;
    }
}