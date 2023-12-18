import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        s = br.readLine().split(" ");
        int []h = new int[N];
        for(int i=0; i < N; ++i)
            h[i] = Integer.parseInt(s[i]);

        int []dp = new int[N];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;
        dp[1] = Math.abs(h[0] - h[1]);

        for(int i=2; i < N; ++i)
            for(int j = (i-K < 0 ? 0 : i - K); j < i; ++j)
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(h[i] - h[j]));

        System.out.println(dp[N-1]);
    }
}