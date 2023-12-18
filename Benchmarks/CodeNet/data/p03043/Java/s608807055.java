import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class  Main{
    public static void main(String[] args) throws Exception{
    	MScanner sc = new MScanner(System.in);
        //MScanner sc = new MScanner("reduce.in");
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt();int k=sc.nextInt();
        double ans=0;
        for(int i=1;i<=n;i++) {
        	int j=i;double base=1;
        	while(j<k) {
        		j*=2;
        		base=0.5*base;
        	}
        	ans+=base;
        }
        pw.println(ans*(1.0/n));
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