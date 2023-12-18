
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
	static int [][]dp;
	
	
	public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        PrintWriter pw =new PrintWriter(System.out);
        char[]a=(" "+sc.next()).toCharArray();
        char[]b=(" "+sc.next()).toCharArray();
        int n=a.length;
        int m=b.length;
        dp=new int [n][m];
        for(int i=1;i<n;i++)
        {
        	for(int j=1;j<m;j++)
        	{
        		if(a[i]==b[j])dp[i][j]=1+dp[i-1][j-1];
        		else
        			dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
        	}
        }
        StringBuilder sb=new StringBuilder();
        int i=n-1;
        int j=m-1;
        while(i>0&&j>0)
        	{
        		if(a[i]==b[j]&&dp[i][j]==dp[i-1][j-1]+1) {
        			sb.append(a[i]);
        			i--;j--;}
        		else {
        			if(dp[i-1][j]>dp[i][j-1])
        			{
        				i--;
        			}
        			else j--;
        		}
        			
        	}
        sb.reverse();
        pw.println(sb);
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
