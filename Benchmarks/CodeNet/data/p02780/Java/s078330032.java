import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] p = new int[N];
        for (int i=0; i<N; i++) {
            p[i] = sc.nextInt();
        }

        System.out.println(solve(N, K, p));
    }

    private static double solve(int N, int K, int[] p) {
        double[] exp = new double[N];
        for (int i=0; i<N; i++) {
            exp[i] = (1+p[i])  / 2.0;
//            System.err.print(exp[i] + " ");
        }


        double sum = 0;
        for (int k=0; k<K; k++) {
            sum += exp[k];
        }

        double max = sum;
        for (int k=K; k<N; k++) {
            sum = sum - exp[k-K] + exp[k];
            max = Math.max(max, sum);
        }

        return max;
    }
}