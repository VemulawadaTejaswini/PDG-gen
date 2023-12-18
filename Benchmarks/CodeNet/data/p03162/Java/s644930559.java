import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

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
                catch (IOException  e)
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		int N = sc.nextInt();
		long[][] dp = new long[3][N+10]; 
		for (int i=1; i<=N; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(); 
			dp[0][i] = Math.max(dp[1][i-1], dp[2][i-1]) + a; 
			dp[1][i] = Math.max(dp[0][i-1], dp[2][i-1]) + b; 
			dp[2][i] = Math.max(dp[0][i-1], dp[1][i-1]) + c; 
		}
		System.out.println(Math.max(dp[0][N], Math.max(dp[1][N], dp[2][N])));
	}

}
