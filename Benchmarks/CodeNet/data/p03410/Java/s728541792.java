import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = readArray(sc, N);
        int[] b = readArray(sc, N);

        System.out.println(solve(a, b));

        sc.close();
    }

    static int[] readArray(Scanner sc, int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; ++i) {
            result[i] = sc.nextInt();
        }

        return result;
    }

    static int solve(int[] a, int[] b) {
        int result = 0;
        for (int i = 0; i <= 28; ++i) {
            int T = 1 << i;
            if (isXORBitOne(mod2T(a, T), mod2T(b, T), T)) {
                result += T;
            }
        }

        return result;
    }

    static int[] mod2T(int[] values, int T) {
        return Arrays.stream(values).map(x -> x % (2 * T)).toArray();
    }

    static boolean isXORBitOne(int[] a, int[] b, int T) {
        b = Arrays.stream(b).boxed().sorted().mapToInt(x -> x).toArray();

        long oneCount = 0;
        for (int ai : a) {
            oneCount += findNum(b, T - ai, 2 * T - 1 - ai) + findNum(b, 3 * T - ai, 4 * T - 1 - ai);
        }

        return oneCount % 2 != 0;
    }

    static int findNum(int[] b, int minTarget, int maxTarget) {
        return findMaxIndex(b, maxTarget) - findMinIndex(b, minTarget) + 1;
    }

    static int findMaxIndex(int[] b, int maxTarget) {
        int result = -1;
        int lower = 0;
        int upper = b.length - 1;
        while (lower <= upper) {
            int middle = (lower + upper) / 2;
            if (b[middle] <= maxTarget) {
                result = middle;
                lower = middle + 1;
            } else {
                upper = middle - 1;
            }
        }

        return result;
    }

    static int findMinIndex(int[] b, int minTarget) {
        int result = b.length;
        int lower = 0;
        int upper = b.length - 1;
        while (lower <= upper) {
            int middle = (lower + upper) / 2;
            if (b[middle] >= minTarget) {
                result = middle;
                upper = middle - 1;
            } else {
                lower = middle + 1;
            }
        }

        return result;
    }
}