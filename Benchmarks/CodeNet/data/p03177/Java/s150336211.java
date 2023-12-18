//package april2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
	static long[] dp;
	static int n;
	static long MOD = (long)1e9+7,k;
//	static ArrayList<Integer>[] graph;
//	static HashSet<Integer> visited;
//	static long[][] dp;
//	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream ( System.out );
		n = scn.nextInt();
		k=scn.nextLong();
		dp = new long[n];
		Arrays.fill(dp, 1);
		long[][] can = new long[n][n]; 
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				can[i][j]= scn.nextLong();
			}
		}
		M ans = new M();
		
		for(int i =0;i<n;i++) {
			ans.t[i][i]=1;
		}
		
		M m = new M();
		
		m.t =can;
		
		while(k>0) {
			if(k%2==1) {
				ans = ans.mul(m);
			}
			m = m.mul(m);
			k/=2;
		}
		long total=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				total= (total+ans.t[i][j])%MOD;
			}
		}
		out.write((total+"\n").getBytes());
//		for(long step = 0;step<k;step++) {
//			long[] new_dp = new long[n];
//			
//			for(int i=0;i<n;i++) {
//				for(int j=0;j<n;j++) {
//					if(can[i][j]) {
//						new_dp[j]=(new_dp[j]+dp[i])%MOD;
//					}
//				}
//			}
//			dp=new_dp;
//		}
//		long ans=0;
//		for(int i =0;i<n;i++) {
//			ans=(ans+dp[i])%MOD;
//		}
//		out.write((ans+"\n").getBytes());
		out.close();
	}
	static class M{
		long[][] t;
		public M() {
			this.t = new long[n][n];
		}
		M mul(M o) {
			M c = new M();
			for(int i =0;i<n;i++) {
				for(int j=0;j<n;j++) {
					for(int k=0;k<n;k++) {
						c.t[i][k] = (c.t[i][k]+this.t[i][j]*o.t[j][k]%MOD)%MOD;
					}
				}
			}
			return c;
		}
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
}
