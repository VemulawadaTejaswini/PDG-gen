import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	//Fast IO class
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
        public FastReader() 
        { 
        	boolean env=System.getProperty("ONLINE_JUDGE") != null;
        	if(env) {
        		try {
					br=new BufferedReader(new FileReader("src\\input.txt"));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
        	}
        	else {
        		br = new BufferedReader(new
                        InputStreamReader(System.in)); 
        	}
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
    //Main function(The main code starts from here)
    public static void main (String[] args) throws java.lang.Exception
    {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
    	int test=1;
        while(test-->0) {
        	int n=sc.nextInt(),W=sc.nextInt();
        	long dp[]=new long[W+1];
        	for(int i=0;i<n;i++) {
        		int w=sc.nextInt(),v=sc.nextInt();
        		for(int j=W;j>=w;j--) {
        			dp[j]=Math.max(dp[j-w]+v, dp[j]);
        		}
        	}
        	out.println(dp[W]);
        }
        out.close();
    }
}