import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class  Main{
	static int inf=(int)2e9;
	static long[][]memo;
	static int[]v;
	static int[]ws;
	static long dp(int i,int val) {
		if(i>=v.length) {
			if(val==0)return 0;
			return inf;
		}
		if(val==0)return 0;
		if(val<0)return inf;
		if(memo[i][val]!=-1)return memo[i][val];
		
		return memo[i][val]=Math.min(dp(i+1,val-v[i])+ws[i],dp(i+1,val));
	}
    public static void main(String[] args) throws Exception{
    	MScanner sc = new MScanner(System.in);
        //MScanner sc = new MScanner("reduce.in");
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt();int w=sc.nextInt();
        v=new int[n];ws=new int[n];
        memo=new long[n][100001];
        for(int i=0;i<n;i++) {
        	ws[i]=sc.nextInt();v[i]=sc.nextInt();
        }
        
        for(long[]a:memo)Arrays.fill(a,-1);
        int ans=-1;
        for(int i=1;i<100001;i++) {
        	dp(0,i);
        }
       // System.out.println(memo[0][17]);
        for(int i=0;i<n;i++) {
        	for(int j=0;j<100001;j++) {
        		if(memo[i][j]!=-1) {
        			if(memo[i][j]<=w) {
        				ans=Math.max(ans,j);
        			}
        		}
        	}
        }
        pw.println(ans);
        pw.flush();
    }
    
    static class MScanner {
		StringTokenizer st;
		BufferedReader br;
 
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}