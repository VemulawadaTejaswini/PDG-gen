import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter syso = new PrintWriter(System.out);
		int n=sc.nextInt();
		long d=sc.nextLong();
		int c=0;
		for(int i=0;i<n;i++) {
			long a=sc.nextLong();
			long b=sc.nextLong();
			if((a*a+b*b)<=d*d)c++;
		}
		syso.println(c);
        syso.close();
    }
    
 
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
 
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
 
		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
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
			return Double.parseDouble(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
		public int[] nextArr(int n) throws IOException{
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=nextInt();
			return arr;
		}
		public BigInteger BigInteger(String s) throws IOException{
			BigInteger a=new BigInteger(s);
			return a;
		}
 
	}
}