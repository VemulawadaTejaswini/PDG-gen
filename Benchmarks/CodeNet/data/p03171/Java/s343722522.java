//package Dynamic_Programming;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
public class Main{
	static FastReader scn = new FastReader();
	static OutputStream out = new BufferedOutputStream ( System.out );
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int t = 1;
		while(t-->0) {
			int n =scn.nextInt();
			long[] arr = new long[n];
			long s = 0;
			for(int i  =0;i<n;i++) {
				arr[i]=scn.nextInt();
				s+=arr[i];
			}
			long x = find_optimal_sum(arr);
			x = 2*x-s;
			out.write((x+"\n").getBytes());
//			System.out.println(find_optimal_sum(arr));
		}
		out.close();
	}
	private static long find_optimal_sum(long[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		long[][] dp = new long[n][n];
		for(int gap = 0;gap<n;gap++) {
			for(int i = 0,j=gap;j<n;i++,j++) {
				long c1 = ((i+2)<=j)?dp[i+2][j]:0;
				long c2 = ((i+1)<=(j-1))?dp[i+1][j-1]:0;
				long c3 = (i<=(j-2))?dp[i][j-2]:0;
				
				dp[i][j] = Math.max(arr[i]+Math.min(c2,c1), arr[j]+Math.min(c3,c2));
			}
		}
		return dp[0][n-1];
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
