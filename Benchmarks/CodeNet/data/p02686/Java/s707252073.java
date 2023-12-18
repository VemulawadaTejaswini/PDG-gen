import java.io.*;
import java.util.*;

public class Main{
	static int compare(int[]x,int[]y) {
		boolean posX=(x[0]-x[1])>=0;
		boolean posY=(y[0]-y[1])>=0;
		if(posX!=posY) {
			return posX?-1:1;
		}
		if(posX) {
			return y[0]-x[0];
		}
		return x[0]-y[0];
	}
	static void main() throws Exception{
		int n=sc.nextInt();
		char[][]in=new char[n][];
		PriorityQueue<int[]>pq=new PriorityQueue<>((x,y)->compare(x, y));
		int curPref=0;
		for(int i=0;i<n;i++) {
			in[i]=sc.nextLine().toCharArray();
			int pref=0;
			int maxPref=0,maxSuff=0;
			for(char c:in[i]) {
				pref+=(c=='('?1:-1);
				maxPref=Math.max(maxPref, pref);
			}
			int suff=0;
			for(int j=in[i].length-1;j>=0;j--) {
				char c=in[i][j];
				suff+=(c==')'?1:-1);
				maxSuff=Math.max(maxSuff, suff);
			}
			
			pq.add(new int[] {maxPref,maxSuff});
			
		}
		boolean yes=true;
		while(!pq.isEmpty() && yes) {
			int idx = pq.poll()[2];
			for(char c:in[idx]) {
				curPref+=(c=='('?1:-1);
				if(curPref<0) {
					yes=false;
				}
			}
		}
		
		
		pw.println(yes && curPref==0?"Yes":"No");
	}
	public static void main(String[] args) throws Exception{
		sc=new MScanner(System.in);
		pw = new PrintWriter(System.out);
		int tc=1;
	//	tc=sc.nextInt();
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
	        int[]inArr=new int[n];for(int i=0;i<n;i++)inArr[i]=nextInt();
	        return inArr;
		}
		public long[] longArr(int n) throws IOException {
	        long[]inArr=new long[n];for(int i=0;i<n;i++)inArr[i]=nextLong();
	        return inArr;
		}
		public int[] intSortedArr(int n) throws IOException {
	        int[]inArr=new int[n];for(int i=0;i<n;i++)inArr[i]=nextInt();
	        shuffle(inArr);
	        Arrays.sort(inArr);
	        return inArr;
		}
		public long[] longSortedArr(int n) throws IOException {
	        long[]inArr=new long[n];for(int i=0;i<n;i++)inArr[i]=nextLong();
	        shuffle(inArr);
	        Arrays.sort(inArr);
	        return inArr;
		}
		public Integer[] IntegerArr(int n) throws IOException {
	        Integer[]inArr=new Integer[n];for(int i=0;i<n;i++)inArr[i]=nextInt();
	        return inArr;
		}
		public Long[] LongArr(int n) throws IOException {
	        Long[]inArr=new Long[n];for(int i=0;i<n;i++)inArr[i]=nextLong();
	        return inArr;
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
	static void shuffle(int[]inArr) {
		for(int i=0;i<inArr.length;i++) {
			int idx=(int)(Math.random()*inArr.length);
			int tmp=inArr[i];
			inArr[i]=inArr[idx];
			inArr[idx]=tmp;
		}
	}
	static void shuffle(long[]inArr) {
		for(int i=0;i<inArr.length;i++) {
			int idx=(int)(Math.random()*inArr.length);
			long tmp=inArr[i];
			inArr[i]=inArr[idx];
			inArr[idx]=tmp;
		}
	}
}
