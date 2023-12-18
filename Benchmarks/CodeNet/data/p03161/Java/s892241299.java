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
		int N = sc.nextInt(), K = sc.nextInt();
		int[] h = new int[N]; 
		for (int i=0; i<N; i++) {
			h[i] = sc.nextInt(); 
		}
		int[] dp = new int[N+10]; 
		Arrays.fill(dp, 1<<30);
		dp[0] = 0; 
		for (int i=0; i<N; i++) {
			for (int j=1; j<=K; j++) {
				if (i+j<N) {
					dp[i+j] = Math.min(dp[i+j], dp[i] + Math.abs(h[i]-h[i+j])); 
				}
				else {
					break; 
				}
 			}
		}
		System.out.println(dp[N-1]);
	}

}
