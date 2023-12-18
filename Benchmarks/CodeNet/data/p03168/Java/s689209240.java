
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) {
        FastReader reader = new FastReader();

        int N = reader.nextInt();
        double [] value = new double [N];

        for (int i = 0; i < N; i++) {
            value[i] = reader.nextDouble();
        }

        double [][] dp = new double [N + 1][N + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0) {
                    dp[i][j] = 1;
                    break;
                }
                dp[i][j] = (j == 0? 0 : dp[i - 1][j - 1]) * value[i - 1] + dp[i - 1][j] * (1 - value[i - 1]);

            }
        }
        double p = 0;
        for (int heads = dp[0].length - 1; heads >= 0 ; heads--) {
            int tails = N - heads;
            if (heads > tails)
                p += dp[dp.length - 1][heads];
        }

        System.out.println(p);
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
