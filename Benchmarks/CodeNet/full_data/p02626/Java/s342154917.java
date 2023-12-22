import java.io.*;
import java.util.*;

public class Main{
	static long max,xor,and;
	static Boolean[][]memo;
	static boolean dp(int bit,int small) {
		if(bit<0)return true;
		if(memo[bit][small]!=null)return memo[bit][small];
		long xorBit=((xor>>bit)&1),andBit=((and>>bit)&1),maxBit=((max>>bit)&1);
		if(andBit==1) {
			//put 1
			if(maxBit==0)return memo[bit][small]=small==1?dp(bit-1, 1):false;
			return memo[bit][small]=dp(bit-1, small);
		}
		//andbit=0
		if(xorBit==0) {
			//put 0
			return memo[bit][small]=maxBit==1?dp(bit-1, 1):dp(bit-1, small);
		}
		//out 1 or zero
		boolean one=maxBit==0?(small==1?dp(bit-1, 1):false):dp(bit-1, small);
		boolean zero=maxBit==1?dp(bit-1, 1):dp(bit-1, small);
		return memo[bit][small]=one||zero;
	}
	static long trace(int bit,int small) {
		if(bit<0)return 0;
		long xorBit=((xor>>bit)&1),andBit=((and>>bit)&1),maxBit=((max>>bit)&1);
		if(andBit==1) {
			//put 1
			if(maxBit==0)return 1l<<bit | trace(bit-1, 1);
			return 1l<<bit | trace(bit-1, small);
		}
		//andbit=0
		if(xorBit==0) {
			//put 0
			return maxBit==1?trace(bit-1, 1):trace(bit-1, small);
		}
		//out 1 or zero
		boolean one=maxBit==0?(small==1?dp(bit-1, 1):false):dp(bit-1, small);
		boolean zero=maxBit==1?dp(bit-1, 1):dp(bit-1, small);
		return one?(maxBit==0?(1l<<bit | trace(bit-1, 1)):(1l<<bit | trace(bit-1, small))):(maxBit==1?trace(bit-1, 1):trace(bit-1, small));
	
	}
	static void main() throws Exception{
		int n=sc.nextInt();
		max=sc.nextLong();
		long sum=max+sc.nextLong();
		xor=0;
		for(int i=0;i<n-2;i++)xor^=sc.nextLong();
		and=sum-xor;
		if(and<0 || (and&1)==1) {
			pw.println(-1);
			return;
		}
		and>>=1;
		for(int bit=0;bit<=47;bit++) {
			if(((and>>bit)&1)==1 && ((xor>>bit)&1)==1) {
				pw.println(-1);
				return;
			}
		}
		memo=new Boolean[48][2];
		if(!dp(47, 0)) {
			pw.println(-1);
			return;
		}
		long ans=max-trace(47, 0);
		pw.println(ans>=max?-1:ans);
	}
	public static void main(String[] args) throws Exception{
		pw=new PrintWriter(System.out);
		sc = new MScanner(System.in);
//		int tc=sc.nextInt();
//		while(tc-->0)
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
			int idx=(int)(Math.random()*in.length);
			int tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
	static void shuffle(long[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			long tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
}
