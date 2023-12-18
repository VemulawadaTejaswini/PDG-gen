import java.util.Scanner;

public class Main {

    private static final long N = 1000000007;

    // Calculates (a + b)! / (a! * b!)
    public static long calcCmbs(long a, long b) {
        long c = Math.min(a, b);
        long d = 1;
        long e = 1;
        for (long i = 0; i < c; i++) {
            d *= a + b - i;
            e *= i + 1;
        }
        return (d / e) % N;
    }

    public static long countCombinations(int[][] sets, int n) {
        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = sets[i][0] + sets[j][0];
                int b = sets[i][1] + sets[j][1];

                long tmp = calcCmbs(a, b);
                count += tmp;
            }
        }
        return count % N;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] sets = new int[n][];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sets[i] = new int[]{a, b};
        }

        long result = countCombinations(sets, n);
        System.out.println(result);
    }
}

