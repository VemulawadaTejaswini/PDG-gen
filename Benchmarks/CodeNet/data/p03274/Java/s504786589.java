import java.util.Scanner;

class Main {
    public static void main(String... args) {        
        int N = IN.nextInt();
        int K = IN.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = IN.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        int j;
        int dist;
        for (int i = 0; i <= N - K; i++) {
            j = i + K - 1;
            if (x[j] <= 0) {
                ans = Math.min(ans, -x[i]);
            } else if (0 <= x[i]) {
                ans = Math.min(ans, x[j]);
            } else {
                dist = Math.min(Math.abs(x[i]), x[j]);
                ans = Math.min(ans, x[j] - x[i] + dist);
            }
        }
        System.out.println(ans);
    }
    final static Scanner IN = new Scanner(System.in);
}