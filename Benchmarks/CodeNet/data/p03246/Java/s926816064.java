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
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		int n=sc.nextInt();
		int[]occeven=new int[(int)1e5+1];
		int[]occodd=new int[(int)1e5+1];
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				occeven[sc.nextInt()]++;
			}
			else {
				occodd[sc.nextInt()]++;
			}
		}
		int maxe=0;LinkedList<Integer>max=new LinkedList<Integer>();
		for(int i=0;i<occeven.length;i++) {
			if(occeven[i]>maxe) {
				maxe=occeven[i];
				max=new LinkedList<Integer>();max.add(i);
			}
			else {
				if(occeven[i]==maxe) {
					max.add(i);
				}
			}
		}
		int maxe2=0;
		if(maxe<n/2 && max.size()==1) {
			for(int i=0;i<occeven.length;i++) {
				if(occeven[i]>maxe2 && maxe2!=maxe) {
					maxe2=occeven[i];
				}
			}
		}
		int ans=1000000;
		for(int i=0;i<occodd.length;i++) {
			if(occodd[i]>0) {
				if(max.size()>1 || i!=max.getFirst()) {
					ans=Math.min(ans,n-maxe-occodd[i]);
				}
				else {
					ans=Math.min(ans,n-maxe2-occodd[i]);
				}
			}
		}
		pw.println(ans);
		
		pw.close();
		pw.flush();
 
	}
	static int gcd(int a, int b) {

		if (b == 0)
			return a;
		return gcd(b, a % b);
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