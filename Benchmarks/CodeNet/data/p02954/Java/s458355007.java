import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		MScanner sc = new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		char[]in=sc.nextLine().toCharArray();int c[]=new int[in.length];
		int i=0;
		while(i<in.length) {
			int k=0;int j=i-1;
			if(in[i]=='R') {
				while(in[i]=='R') {
					k++;i++;
				}
				c[i]+=k/2;
				c[i-1]+=(k-k/2);
			}
			else {
				while(i<in.length && in[i]=='L') {
					k++;i++;
				}
				c[j]+=k/2;
				c[j+1]+=(k-k/2);
			}
			
		}
		
		for(int j=0;j<in.length;j++)pw.print(c[j]+" ");
		pw.close();
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