import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		final int n = sc.nextInt();
		final long c = sc.nextLong();
		long [] x = new long[n];
		long [] v = new long[n];
//		ArrayList<Long> xs1 = new ArrayList<>(); // x<=c/2
//		ArrayList<Long> vs1 = new ArrayList<>();
//		ArrayList<Long> xs2 = new ArrayList<>();
//		ArrayList<Long> vs2 = new ArrayList<>();
		for(int i=0; i<n; i++) {
			x[i] = sc.nextLong();
			v[i] = sc.nextLong();
			if(x[i]<=c/2) {
				xs1.add(x[i]);
				vs1.add(v[i]);
			} else {
				xs2.add(x[i]);
				vs2.add(v[i]);
			}
		}
//		long [] imosx = new long[n];
////		imosx[0] = x[0];
////		for(int i=1; i<n; i++) {
////			imosx[i] = imosx[i-1]+x[i];
////		}
		long [] imosv = new long[n];
		imosv[0] = v[0];
		for(int i=1; i<n; i++) {
			imosv[i] = imosv[i-1]+v[i];
		}
//		// clockwise
//		long[] imosvclock = new long[n];
//		long imosclockMax = 0;
//		for(int i=0; i<n; i++) {
//			imosvclock[i] = imosv[i]-x[i];
//			imosclockMax = Math.max(imosclockMax, imosvclock[i]);
//		}
//		long[] imosvclock2 = new long[n];
//		long imosclock2Max = 0;
//		for(int i=0; i<n; i++) {
//			imosvclock2[i] = imosv[i]-2*x[i];
//			imosclock2Max = Math.max(imosclock2Max, imosvclock2[i]);
//		}
//		// rev imos
//		long[] revimos = new long[n];
//		revimos[n-1] = v[n-1];
//		for(int i=n-2; i>=0; i--) {
//			revimos[i] = revimos[i+1] + v[i];
//		}
//		// counter clockwise
//		long[] imosvcounter = new long[n];
//		long imoscounterMax = 0;
//		for(int i=n-1; i>=0; i--) {
//			imosvcounter[i]=revimos[i]-(c-x[i]);
//			imoscounterMax = Math.max(imoscounterMax, imosvcounter[i]);
//		}
//		long[] imosvcounter2 = new long[n];
//		long imoscounter2Max = 0; 
//		for(int i=n-1; i>=0; i--) {
//			imosvcounter2[i] = revimos[i]-2*(c-x[i]);
//			imoscounter2Max = Math.max(imoscounter2Max, imosvcounter2[i]);
//		}
		long ans = 0;
		// 1
		for(int m=0; m<n; m++) {
			int l = m+1;
			int r = n;
			while(Math.abs(l-r)>1) {
				int mid = (l+r)/2;
				long tmppoint = imosv[m]+(imosv[n-1]-imosv[mid-1])-Math.min(2*x[m]+(c-x[mid]), 2*(c-x[mid])+x[m]);
				ans = Math.max(ans, tmppoint);
			}
//			for(int k=m+1; k<n; k++) {
//				ans = Math.max(ans, imosv[m]+(imosv[n-1]-imosv[k-1])-Math.min(2*x[m]+(c-x[k]), 2*(c-x[k])+x[m]));
//			}
		}
		// 2
		for(int m=0; m<n; m++) {
			ans = Math.max(ans, imosv[m]-x[m]);
		}
		// 3
		for(int k=0; k<n; k++) {
			if(k!=0) {
				ans = Math.max(ans, imosv[n-1]-imosv[k-1]-(c-x[k]));	
			} else {
				ans = Math.max(ans, imosv[n-1]-(c-x[k]));	
			}
			
		}
		System.out.println(ans);
	}

	static class MyScanner
	{
		BufferedReader br;
		StringTokenizer st;
		public MyScanner(InputStream s)
		{
			br=new BufferedReader(new InputStreamReader(s));
		}
		public String nextLine() throws IOException
		{
			return br.readLine();
		}
		public String next() throws IOException
		{
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException
		{
			return Integer.parseInt(next());
			
		}
		public double nextDouble() throws IOException
		{
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException
		{
			return br.ready();
		}
		public long nextLong() throws IOException
		{
			return Long.parseLong(next());
		}
	}
}
