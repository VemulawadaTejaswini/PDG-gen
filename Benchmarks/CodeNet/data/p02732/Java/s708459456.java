import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class Main {
	static Scanner sc;
	static PrintWriter out;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int l = sc.nextInt();
		HashMap<Integer, Long> map = new HashMap<Integer, Long>();
		int a[] = new int[l];
		for (int i = 0; i < a.length; i++) {
			int tmp = sc.nextInt();
			a[i] = tmp;
			map.put(tmp, map.getOrDefault(tmp, 0l)+1);
		}
		long total = 0l;
		for(Entry<Integer, Long>e:map.entrySet()) {
			long n = e.getValue();
			total += n*(n-1)/2;
		}
		for(int i:a) {
			long v = map.get(i);
			long ans = total - v*(v-1)/2 + (v-1)*(v-2)/2; 
			out.println(ans);
		}
		
		out.flush();
	} 
	static boolean isPalindrome(String s) {
		int l = s.length();
		char[] sa = s.toCharArray();
		for(int i=0;i<l/2;i++) {
			if(sa[i] != sa[l-i-1])
				return false;
		}
		return true;
	}
	static class Scanner{
		private BufferedReader br;
		private StringTokenizer st;
		public Scanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}
		public String next() throws IOException{
			while(st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
		public int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException{
			return Long.parseLong(next());
		}
		public double nextDouble() throws IOException{
			return Double.parseDouble(next());
		}
		public int[] inArr(int n) throws Exception{
			int a [] = new int[n];
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			return a;
		}
	}
}