import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception{
		PrintWriter pw=new PrintWriter(System.out);
		MScanner sc = new MScanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt(),c=sc.nextInt();
		char[]in=sc.nextLine().toCharArray();
		int can=0;
		for(char ch:in)if(ch=='o')can++;
		if(can<=k) {
			for(int i=0;i<n;i++) {
				if(in[i]=='o') {
					pw.println(i+1);
				}
			}
			pw.flush();
			return;
		}
		int[]before=new int[n],after=new int[n];
		before[0]=-1;
		after[n-1]=n+7;
		for(int i=1;i<n;i++) {
			if(i-c-1>=0) {
				if(in[i-c-1]=='o') {
					before[i]=i-c-1;
				}
				else {
					before[i]=before[i-c-1];
				}
				before[i]=Math.max(before[i], before[i-1]);
			}
			else {
				before[i]=-1;
			}
		}
		
		for(int i=n-1;i>=0;i--) {
			if(i+c+1<n) {
				if(in[i+c+1]=='o') {
					after[i]=i+c+1;
				}
				else {
					after[i]=after[i+c+1];
				}
				after[i]=Math.min(after[i], after[i+1]);
			}
			else {
				after[i]=n+7;
			}
		}
		
		
		int[]prefCan=new int[n],sufCan=new int[n];
		for(int i=0;i<n;i++) {
			if(in[i]!='o')prefCan[i]=prefCan[i-1];
			else {
				int idx=before[i];
				if(idx==-1) {
					prefCan[i]=1;
				}
				else {
					prefCan[i]=prefCan[idx]+1;
				}
			}
		}
		for(int i=n-1;i>=0;i--) {
			if(in[i]!='o')sufCan[i]=sufCan[i+1];
			else {
				int idx=after[i];
				if(idx==n+7) {
					sufCan[i]=1;
				}
				else {
					sufCan[i]=sufCan[idx]+1;
				}
			}
		}
//		System.out.println(Arrays.toString(before));
//		System.out.println(Arrays.toString(after));
//		System.out.println(Arrays.toString(sufCan));
//		System.out.println(Arrays.toString(prefCan));
		for(int i=0;i<n;i++) {
			if(in[i]=='o') {
				int p=i==0?0:prefCan[i-1];
				int s=i==n-1?0:sufCan[i+1];
//				System.out.println(p+" "+s);
				if(p+s<k) {
					pw.println(i+1);
				}
			}
		}
		
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
	static void addX(int[]in,int x) {
		for(int i=0;i<in.length;i++)in[i]+=x;
	}
	static void addX(long[]in,int x) {
		for(int i=0;i<in.length;i++)in[i]+=x;
	}
}