import java.io.InputStream;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int nCoeff = 0;
        int mCoeff = 0;

        if (n > 1) {
            nCoeff = binomialCoefficient(n, 2);
        }

        if (m > 1) {
            mCoeff = binomialCoefficient(m, 2);
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