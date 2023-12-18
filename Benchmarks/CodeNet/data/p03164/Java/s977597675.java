import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String [] args) {
        FastReader reader = new FastReader();
 
        int N = reader.nextInt();
        int W = reader.nextInt();
        int maxValue = 0;
        int [] weight = new int [N];
        int [] sum = new int [N];
        int [] value = new int [N];
 
        for (int i = 0; i < N; i++) {
            weight[i] = reader.nextInt();
            value[i] = reader.nextInt();
            sum [i] = value[i] + (i > 0 ? sum[i - 1] : 0);
        }
 
        long [][] dp = new long [N + 1][sum[N - 1] + 1];
 
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            dp[i][0] = 0;
            if (i == 0) continue;
            int wi = weight[i - 1], vi = value[i - 1];
            for (int v = 1; v <= sum[i - 1]; v++) {
                dp[i][v] = dp[i - 1][v];
                int temp = Math.max(0, v - vi);
                dp[i][v] = Math.min(dp[i][v], dp[i - 1][temp] + wi);
                if (dp[i][v] <= W) {
                    maxValue = Math.max(maxValue, v);
                }
            }
        }
 
        System.out.println(maxValue);
 
    }
 
 
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}