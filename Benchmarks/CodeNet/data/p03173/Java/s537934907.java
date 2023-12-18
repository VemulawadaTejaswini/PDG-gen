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
		int N = sc.nextInt();
		long[] a = new long[N+1], psa = new long[N+1];
		
		for (int i=1; i<=N; i++) {
			a[i] = sc.nextLong(); 
			psa[i] = psa[i-1] + a[i]; 
		}
		long[][] dp = new long[N+10][N+10]; 
		for (int i=0; i<=N+8; i++) {
			Arrays.fill(dp[i], 1L<<60);
		}

		for (int len=1; len<=N; len++) {
			for (int i=1; i<=N-len+1; i++) {
				int j = i + len -1; 
				if (len==1) {
					dp[i][j] = 0; 
				}
				else {
					for (int k=i; k<=j-1; k++) {
						dp[i][j] = Math.min(dp[i][j],dp[i][k]+dp[k+1][j]+psa[j]-psa[i-1]);
					}
					
				}
			}
		}
		System.out.println(dp[1][N]);
//		for (int i=1; i<=N; i++) {
//			for (int j=1; j<=N; j++) {
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
	}	

}
