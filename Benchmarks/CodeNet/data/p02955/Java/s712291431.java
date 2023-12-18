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
	static long gcd(long a, long b) {

		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
	public static void main(String[] args) throws IOException {
		MScanner sc = new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int n=sc.nextInt();int k=sc.nextInt();int max=0;int sum=0;
		int[]in=new int[n];long g=-1;
		for(int i=0;i<n;i++) {
			in[i]=sc.nextInt();
			sum+=in[i];
			max=Math.max(in[i], max);
			if(g==-1)g=in[i];
			else {
				g=gcd(g,in[i]);
			}
		}
		if(sum-max<=k) {
			pw.println(sum);pw.flush();return;
		}
		if(k==0) {
			pw.println(g);pw.flush();return;
		}
		Arrays.sort(in);
		int can=0;int kk=k;int i=0;
		for(;i<n;i++) {
			if(in[i]<=kk) {
				can+=in[i];kk-=in[i];in[i]=0;
			}
			else {
				can+=kk;in[i]-=kk;break;
			}
		}
		int j=1;int min=-1;
		for(;i<n-1;i++) {
			
			if(can>=j*(in[i+1]-in[i])) {
				can-=(in[i+1]-in[i]);
				in[i]=in[i+1];
			}
			else {
				min=(can/j)+in[i];break;
			}
			j++;
		}
		int z=(int)Math.ceil(Math.sqrt(sum))+1;
		while(z>1) {
			if(sum%z==0 && z<=min) {
				pw.println(z);pw.flush();return;
			}
			z--;
		}
		pw.println(1);
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