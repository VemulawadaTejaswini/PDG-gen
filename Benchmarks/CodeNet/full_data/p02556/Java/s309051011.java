import java.io.*;
import java.util.*;

public class Main{
	static void main() throws Exception{
		int n=sc.nextInt();
		int[][]in=new int[n][2];
		TreeSet<int[]>ts1=new TreeSet<int[]>((x,y)->x[0]==y[0]?x[1]-y[1]:x[0]-y[0]);
		TreeSet<int[]>ts2=new TreeSet<int[]>((x,y)->x[0]==y[0]?x[1]-y[1]:x[0]-y[0]);
		TreeSet<int[]>ts3=new TreeSet<int[]>((x,y)->x[0]==y[0]?x[1]-y[1]:x[0]-y[0]);
		TreeSet<int[]>ts4=new TreeSet<int[]>((x,y)->x[0]==y[0]?x[1]-y[1]:x[0]-y[0]);
		for(int i=0;i<n;i++) {
			int x=sc.nextInt(),y=sc.nextInt();
			ts1.add(new int[] {x+y,i});
			ts2.add(new int[] {x-y,i});
			ts3.add(new int[] {-x+y,i});
			ts4.add(new int[] {-x-y,i});
			in[i]=new int[] {x,y};
		}
		int[]best=new int[Math.min(8, n)];
		int c=0;
		if(!ts1.isEmpty()) {
			best[c]=ts1.pollFirst()[1];
			int idx=best[c++];
			ts2.remove(new int[] {in[idx][0]-in[idx][1],idx});
			ts3.remove(new int[] {-in[idx][0]+in[idx][1],idx});
			ts4.remove(new int[] {-in[idx][0]-in[idx][1],idx});
		}
		if(!ts1.isEmpty()) {
			best[c]=ts1.pollLast()[1];
			int idx=best[c++];
			ts2.remove(new int[] {in[idx][0]-in[idx][1],idx});
			ts3.remove(new int[] {-in[idx][0]+in[idx][1],idx});
			ts4.remove(new int[] {-in[idx][0]-in[idx][1],idx});
		}
		
		if(!ts2.isEmpty()) {
			best[c]=ts2.pollFirst()[1];
			int idx=best[c++];
			ts3.remove(new int[] {-in[idx][0]+in[idx][1],idx});
			ts4.remove(new int[] {-in[idx][0]-in[idx][1],idx});
		}
		if(!ts2.isEmpty()) {
			best[c]=ts2.pollLast()[1];
			int idx=best[c++];
			ts3.remove(new int[] {-in[idx][0]+in[idx][1],idx});
			ts4.remove(new int[] {-in[idx][0]-in[idx][1],idx});
		}
		
		if(!ts3.isEmpty()) {
			best[c]=ts3.pollFirst()[1];
			int idx=best[c++];
			ts4.remove(new int[] {-in[idx][0]-in[idx][1],idx});
		}
		if(!ts3.isEmpty()) {
			best[c]=ts3.pollLast()[1];
			int idx=best[c++];
			ts4.remove(new int[] {-in[idx][0]-in[idx][1],idx});
		}
		
		if(!ts4.isEmpty()) {
			best[c]=ts4.pollFirst()[1];
			int idx=best[c++];
		}
		if(!ts4.isEmpty()) {
			best[c]=ts4.pollLast()[1];
			int idx=best[c++];
		}
		long ans=0;
		for(int i=0;i<best.length;i++) {
			int idx1=best[i];
			for(int j=i+1;j<best.length;j++) {
				int idx2=best[j];
				ans=Math.max(ans, Math.abs(in[idx1][0]-in[idx2][0])+Math.abs(in[idx1][1]-in[idx2][1]));
			}
		}
		pw.println(ans);
	}
	public static void main(String[] args) throws Exception{
		sc=new MScanner(System.in);
		pw = new PrintWriter(System.out);
		int tc=1;
//		tc=sc.nextInt();
		while(tc-->0)
			main();
		pw.flush();
	}
	static PrintWriter pw;
	static MScanner  sc;
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
		public int[] intArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] longArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public int[] intSortedArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public long[] longSortedArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public Integer[] IntegerArr(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] LongArr(int n) throws IOException {
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
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
	static void shuffle(int[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*(i+1));
			int tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
	static void shuffle(long[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*(i+1));
			long tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
}