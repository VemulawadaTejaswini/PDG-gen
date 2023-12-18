import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;
 
 
public class  Main{
	static char[]in;
	public static void main(String[] args) throws Exception{
    	MScanner sc = new MScanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        in=sc.nextLine().toCharArray();
        int k=sc.nextInt();
        
        if(in.length==1) {
        	pw.println(k/2);
        	pw.flush();
        	return;
        }
        char[]in2=new char[2*in.length];
        int o=0;int c=0;
        while(o<in2.length) {
        	in2[o]=in[c];
        	o++;c++;
        	if(c==in.length)c=0;
        }
        int cnt=0;
        for(int i=1;i<in.length;i++) {
        	if(in[i]==in[i-1]) {
        		cnt++;
        		in[i]='A';
        	}
        }
        int cnt2=0;
        
        for(int i=1;i<in2.length;i++) {
        	if(in2[i]==in2[i-1]) {
        		cnt2++;
        		in2[i]='A';
        	}
        }
        int dif=cnt2-cnt;
        pw.println(cnt*1l+dif*1l*(k-1));
        pw.flush();
        pw.close();
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
		public int[] takearr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] takearrl(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public Integer[] takearrobj(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] takearrlobj(int n) throws IOException {
	        Long[]in=new Long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
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