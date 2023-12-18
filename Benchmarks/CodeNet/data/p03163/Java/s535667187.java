import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
		int N = sc.nextInt(), W = sc.nextInt();
		int[] w = new int[N], v = new int[N]; 
		long[] dp = new long[W+10];
		for (int i=0; i<N; i++) {
			w[i] = sc.nextInt(); 
			v[i] = sc.nextInt(); 
		}
		Arrays.fill(dp, -(1L<<60));
		dp[0] = 0; 
		long ans = 0; 
		for (int i=0; i<N; i++) {
			for (int j=W; j>=w[i]; j--) {
				if (dp[j-w[i]]+v[i]>dp[j]) {
					dp[j] = dp[j-w[i]]+v[i]; 
					ans = Math.max(ans, dp[j]); 
				}
			}
		}
		System.out.println(ans);
	}

}
