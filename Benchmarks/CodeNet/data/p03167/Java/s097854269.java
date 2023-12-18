
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
	static long [][]dp;
	static char inp[][];
	static int h;
	static int w;
	static int total;
	static StringBuilder sb;
	public static long ans(int i ,int j) {
		if(i==h&&j==w)return 1;
		if(i>h||j>w)return 0;
		if(inp[i][j]=='#')return 0;
		if(dp[i][j]!=0)
			return dp[i][j];
		long r=ans(i,j+1);
		long d=ans(i+1,j);	
		return dp[i][j]=r+d;	
			
	}
	
	public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        PrintWriter pw =new PrintWriter(System.out);
        h=sc.nextInt()-1;
        w=sc.nextInt()-1;
        inp=new char[h+1][w+1];
        dp=new long [h+1][w+1];
        for(int i=0;i<=h;i++) {
        	String s=sc.next();
        	for(int j=0;j<=w;j++) {
        		inp[i][j]=s.charAt(j);
                 }}
       // for(long x[]:dp)
        //	Arrays.fill(x, -1);
        pw.println(ans(0,0)%((int)1e9+7));
        pw.flush();
	
        
	}
	
	static class Scanner {
		 
		StringTokenizer st;
		BufferedReader br;
 
		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public Scanner(String file) throws Exception {
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
