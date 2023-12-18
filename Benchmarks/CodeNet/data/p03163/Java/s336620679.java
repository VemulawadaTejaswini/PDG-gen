import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class knapsack {
	static long[][] memo;
	static int []w,v;
	static int n;
	public static long dp(int i,int remW) {
		if(remW==0||i==n)
			return 0;
		if(memo[i][remW]!=-1)
			return memo[i][remW];
		long take=0;
		if(!(remW-w[i]<0))
		 take = dp(i+1,remW-w[i])+v[i];
		
		long  leave =dp(i+1,remW);
		return memo[i][remW]=Math.max(take, leave);
	}
	
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n=sc.nextInt();
       int W=sc.nextInt();
       memo=new long [n][W+1];
       for(int i=0;i<n;i++) {
    	   for(int j=0;j<memo[i].length;j++)
    		   memo[i][j]=-1;
       }
        w=new int[n];
       v=new int[n];
       for(int i=0;i<n;i++) {
    	   w[i]=sc.nextInt();
    	   v[i]=sc.nextInt();
       }
       out.println(dp(0,W));
        out.flush();
    }

    static class Scanner
    {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream system) {br = new BufferedReader(new InputStreamReader(system));}
        public Scanner(String file) throws Exception {br = new BufferedReader(new FileReader(file));}
        public String next() throws IOException
        {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        public String nextLine()throws IOException{return br.readLine();}
        public int nextInt() throws IOException {return Integer.parseInt(next());}
        public double nextDouble() throws IOException {return Double.parseDouble(next());}
        public char nextChar()throws IOException{return next().charAt(0);}
        public Long nextLong()throws IOException{return Long.parseLong(next());}
        public boolean ready() throws IOException{return br.ready();}
        public void waitForInput() throws InterruptedException {Thread.sleep(3000);}
    }
}
    