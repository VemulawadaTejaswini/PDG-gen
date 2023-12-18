import java.io.*;
import java.util.*;

public class Main{
	static long mod=998244353;
	public static void main(String[] args) throws Exception{
		PrintWriter pw=new PrintWriter(System.out);
		MScanner sc = new MScanner(System.in);
		int n=sc.nextInt();
		char[]in=sc.nextLine().toCharArray();
		int[]inModiefied=new int[n];
		for(int i=0;i<n;i++) {
			if(in[i]=='G') {
				inModiefied[i]=1;
			}
			else {
				if(in[i]=='B') {
					inModiefied[i]=2;
				}
			}
		}
		long ans=0;
		int[][]prefOcc=new int[n][3],sufOcc=new int[n][3];
		
		for(int i=0;i<n;i++) {
			if(i>0) {
				prefOcc[i]=prefOcc[i-1].clone();
			}
			prefOcc[i][inModiefied[i]]++;
		}
		
		for(int i=n-1;i>=0;i--) {
			if(i<n-1) {
				sufOcc[i]=sufOcc[i+1].clone();
			}
			sufOcc[i][inModiefied[i]]++;
		}
		for(int i=0;i<n;i++) {
			int[]cntPref=new int[3],cntSuf=new int[3];
			for(int j=0;j<3;j++) {
				if(j==inModiefied[i])continue;
				cntPref[j]=prefOcc[i][j];
				cntSuf[j]=sufOcc[i][j];
			}
			long op1=1,op2=1;
			boolean alt=true;
			for(int j=0;j<3;j++) {
				if(j==inModiefied[i])continue;
				if(alt) {
					op1*=cntPref[j];
					op2*=cntSuf[j];
				}
				else {
					op2*=cntPref[j];
					op1*=cntSuf[j];
				}
				alt=!alt;
			}
			ans+=op1+op2;
		}
		for(int i=0;i<n;i++) {
			int j=i-1,k=i+1;			
			while(j>=0 && k<n) {
				HashSet<Integer>nums=new HashSet<>();
				nums.add(inModiefied[i]);
				nums.add(inModiefied[j]);
				nums.add(inModiefied[k]);
				if(nums.size()==3)ans--;
				j--;k++;
			}
		}
		
		pw.println(ans);
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