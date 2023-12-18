import java.io.*;
import java.util.*;
public class Main {
static long [][] dp;
static long[] v;
static int [] w;
static int n;
static int c;
	public static long solve(int i,int rmw){
        if(i==n||rmw==0){
        	return 0l;
        }
        if((long)dp[i][rmw]!=-1l){
        	return dp[i][rmw];
        }
     
       if(rmw<w[i]){
    	   return dp[i][rmw]=solve(i+1,rmw);
       }
         
      return  dp[i][rmw]=Math.max(v[i]+solve(i+1, rmw-w[i]),solve(i+1,rmw));
        
	}
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		 n=(int)sc.nextLong();
		 c=(int)sc.nextLong();
		 v=new long[n];
	 w=new int[n];
		for(int i=0;i<n;i++){
			w[i]=(int)sc.nextLong();
			v[i]=sc.nextLong();
		}
		dp=new long[n][c+1];
for(int i=0;i<n;i++){
	Arrays.fill(dp[i], (-1));
}


		System.out.println(solve(0,c));
 }


	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
 
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
 
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
	}}