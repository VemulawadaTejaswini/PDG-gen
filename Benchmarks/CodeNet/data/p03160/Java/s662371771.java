import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class A {
    static BufferedReader br;

    private static void nextArr(int[] h) throws Exception {
        String[] parts = br.readLine().split(" ");
        for(int i = 0; i < h.length; i++) h[i] = Integer.parseInt(parts[i]);
    }

    private static int nextInt() throws Exception {
        return Integer.parseInt(br.readLine());
    }

    private static void print(Object... vals) {
        for(int i = 0; i < vals.length; i++) {
            if (i != vals.length - 1) {
                System.out.print(vals[i] + ",");
            } else {
                System.out.print(vals[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int n = nextInt();
        int[] h = new int[n];
        nextArr(h);
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = Math.abs(h[1] - h[0]);
        for(int i = 2; i < n; i++)
            for(int j = 1; j <= 2; j++)
                dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]));
        print(dp[n - 1]);
    }
}
