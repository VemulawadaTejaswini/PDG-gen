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
		int k=sc.nextInt();
		char[]in=sc.nextLine().toCharArray();
		int[]count=new int[n];int[] cha=new int[n];
		int i=0;int c=0;
		while(i<n) {
			if(in[i]=='0') {
				cha[c]=0;int z=0;
				while(i<n && in[i]=='0') {
					z++;i++;
				}
				count[c++]=z;
			}
			else {
				cha[c]=1;int o=0;
				while(i<n && in[i]=='1') {
					o++;i++;
				}
				count[c++]=o;
			}
		}
		int[]pref=new int[c];pref[0]=count[0];
		for(int j=1;j<c;j++) {
			pref[j]=pref[j-1]+count[j];
		}
		int ans=0;
		for(int j=0;j<c;j++) {
			int prev=j-2*k+1;
			if(prev<=0) {
				ans=Math.max(ans,pref[j]);
			}
			else {
				if(cha[prev]==0)prev--;
				if(prev<=0) {
					ans=Math.max(ans,pref[j]);
				}
				else
					ans=Math.max(ans,pref[j]-pref[prev-1]);
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