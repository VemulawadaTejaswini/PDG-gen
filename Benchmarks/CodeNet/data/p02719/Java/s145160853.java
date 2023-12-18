import java.io.*;
import java.util.*;
import java.awt.Point;
public class Main {
	static Scanner sc;
	static PrintWriter out;
	static final int uncal = -1;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		sc = new Scanner(System.in); 
		out = new PrintWriter(System.out);
		long n = sc.nextLong(),k = sc.nextLong();
		long mod = n%k;
		long ans = Math.min(mod, Math.abs(k-mod));
		out.println(ans);
		out.close();
	}
	static void shuffle(int[] array) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}
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
	static class Point extends java.awt.Point implements Comparable<Point>{
		public Point(int x,int y) {
			// TODO Auto-generated constructor stub
			super(x,y);
		}
		public String toString() {
			return x+" "+y;
		}
		@Override
		public int compareTo(Point p) {
			// TODO Auto-generated method stub
			if(x == p.x)
				return y - p.y;
			return x - p.x;
		}
		
	}
	static class Scanner{
		private BufferedReader br;
		private StringTokenizer st;
		public Scanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}
		public Scanner(String filename) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(filename));
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