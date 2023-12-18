import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static long minCost(int[] size){
        long[][] dp = new long[size.length][size.length];
        for (int L = size.length-1; L >= 0; L--) {
            for (int R = L; R < size.length; R++) {
                if (L == R){
                    dp[L][R] = 0;
                }else {
                    dp[L][R] = (long) (1e18+9);
                    long sum = 0;
                    for (int i = L; i <= R; i++) {
                        sum += size[i];
                    }
                    for (int i = L; i < R; i++) {
                        dp[L][R] = Math.min(dp[L][R], dp[L][i]+dp[i+1][R]+sum);
                    }
                }
            }
        }
        return dp[0][size.length - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] slime = new int[N];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            slime[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(minCost(slime));
    }
}
