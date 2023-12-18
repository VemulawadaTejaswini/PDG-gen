import java.io.*;
import java.util.*;

public class  Main{
	static int mod=(int)1e9+7;
	static long[][]comb;
	static void nCr2(int N)		// O(N * N)
	{
		comb = new long[N][N];
		comb[0][0] = 1;
		for (int i = 1; i < N; i++)
		{
			comb[i][0] = 1;
			for (int j = 1; j <= i; j++)
				comb[i][j] = (comb[i-1][j] + comb[i-1][j-1])%mod;		//may use mod
		}
	}
    public static void main(String[] args) throws Exception{
        //MScanner sc = new MScanner("chess.in");
        MScanner sc = new MScanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        //int n=sc.nextInt();int[]in=new int[n];
        //for(int i=0;i<n;i++)in[i]=sc.nextInt();
        int n=sc.nextInt();int b=sc.nextInt();int r=n-b;
        nCr2(2002);
        for(int i=1;i<=b;i++) {
        	long ans=(comb[r+1][i]*comb[b-1][i-1])%mod;
        	pw.println(ans);
        }
        pw.flush();
    }
    static class tri implements Comparable<tri>{
    	int type;int x;int y;
    	tri(int t,int a,int b){
    		type=t;x=a;y=b;
    	}
		@Override
		public int compareTo(tri o) {
			if(type!=o.type)
				return type-o.type;
			return o.x-x;
		}
		public String toString() {
			return "("+x+" "+y+")";
		}
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