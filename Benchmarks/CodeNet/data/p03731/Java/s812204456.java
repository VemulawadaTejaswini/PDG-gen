import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] ts = new int[N];
        for (int i = 0; i < N; i++) {
            ts[i] = sc.nextInt();
        }
        System.out.println( solve(N, T, ts) );
    }

    private static long solve(int N, int T, int[] ts) {
        long ans = 0;
        for (int i = 1; i < N; i++) {
            int prev = ts[i-1];
            int t = ts[i];

            ans += Math.min(T, t - prev);
        }

        ans += T;

        return ans;
    }
}
