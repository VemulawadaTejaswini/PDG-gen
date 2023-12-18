import java.io.*;
import java.util.*;
public class Main {
	static int wins(int p1,int p2) {// 0 -> R , 1 -> P , 2 -> S 
		if(p1==p2)return -1;
		if((p1==0 && p2==1) || (p1==1 && p2==0)) {
			return 1;
		}
		if((p1==0 && p2==2) || (p1==2 && p2==0)) {
			return 0;
		}
		return 2;
	}
	static int k,n;
	static int[][]memo;
	static int[]values;
	static int[]in;
	static int dp(int i,int prev) {
		if(i>=n)return 0;
		if(memo[i][prev]!=-1)return memo[i][prev];
		int ans=0;
		for(int j=0;j<3;j++) {
			if(j!=prev) {
				int val=(wins(in[i],j)==j)?values[j]:0;
				ans=Math.max(ans, dp(i+k,j)+val);
			}
		}
		return memo[i][prev]=ans;
	}
	static void trace(int i,int prev) {
		if(i>=n)return;
		int ans=dp(i,prev);
		for(int j=0;j<3;j++) {
			if(j!=prev) {
				int val=(wins(in[i],j)==j)?values[j]:0;
				if(ans==dp(i+k,j)+val) {
					System.out.println(i+" "+j);
					trace(i+k,j);
					return;
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		MScanner sc=new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		map.put('r', 0);
		map.put('p', 1);
		map.put('s', 2);
		n=sc.nextInt();
		k=sc.nextInt();
		values=new int[3];
		values[0]=sc.nextInt();
		values[2]=sc.nextInt();
		values[1]=sc.nextInt();
		in=new int[n];
		char[]x=sc.nextLine().toCharArray();
		for(int i=0;i<n;i++) {
			in[i]=map.get(x[i]);
		}
		memo=new int[n][4];
		for(int []i:memo)Arrays.fill(i, -1);
		int ans=0;
		for(int i=0;i<k;i++) {
			ans+=dp(i,3);
			//trace(i,3);
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
		public int[] takearr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] takearrl(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public Integer[] takearrobj(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] takearrlobj(int n) throws IOException {
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
