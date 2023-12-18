import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] X = new int[N];
        for (int i=0; i<N; i++) {
            X[i] = sc.nextInt();
        }

        System.out.println(solve(N, X));
    }

    private static int solve(int N, int[] X) {
        int min = Integer.MAX_VALUE;

        for (int p=1; p<=100; p++) {
            int val = 0;
            for (int i=0; i<N; i++) {
                val += (int)Math.pow(X[i] - p, 2);
            }

            min = Math.min(min, val);
        }

        return min;
    }
}