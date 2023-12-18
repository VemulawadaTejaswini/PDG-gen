import java.util.*;
import java.io.*;
public class Main
{   
   
	public static void main(String[] args)throws IOException {
		FastReader kb=new FastReader();
        int n=kb.nextInt();
        int w=kb.nextInt();
        long dp[][]=new long[101][100001];
        int arr[]=new int[n+1];
        int brr[]=new int[n+1];
        for(int i=1;i<=n;i++){arr[i]=kb.nextInt();brr[i]=kb.nextInt();}
        for(int i=1;i<arr.length;i++)
        {
           for(int j=1;j<=w;j++)
           {
               if(j>=arr[i])dp[i][j]=Math.max(dp[i-1][j],brr[i]+dp[i-1][j-arr[i]]);
               else dp[i][j]=dp[i-1][j];
           }
        }
        System.out.println(dp[n][w]);
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











