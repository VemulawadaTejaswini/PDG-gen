import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] x = new int[N];
        for (int i=0; i<N; i++) {
            x[i] = sc.nextInt();
        }

        int ans = solve(N, K, x);

        System.out.println(ans);
    }

    private static int solve(int N, int K, int[] x) {
        int count = 0;

        for (int i=0; i<N; i++) {
            int min = Math.min(x[i], Math.abs(K - x[i]));
            count += min*2;
        }

        return count;
    }

}
