import java.io.*;
import java.util.*;
import java.awt.Point;
public class Main {
	static Scanner sc;
	static PrintWriter out;
	static int x,y;
	static int A,B,C;
	static ArrayList<Integer> red,green,colorless;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		sc = new Scanner(System.in); 
		out = new PrintWriter(System.out);
		x = sc.nextInt();
		y = sc.nextInt();
		A = sc.nextInt();B = sc.nextInt();C = sc.nextInt();
		red = new ArrayList<Integer>();green = new ArrayList<Integer>();colorless = new ArrayList<Integer>(); 
		for (int i = 0; i < A; i++) {
			red.add(sc.nextInt());
		}
		for(int i=0;i<B;i++) {
			green.add(sc.nextInt());
		}
		for(int i=0;i<C;i++) {
			colorless.add(sc.nextInt());
		}
		Collections.sort(red);
		Collections.sort(green);
		Collections.sort(colorless);
		int j = C-1;
		int sum = 0;
		int i=A-1;
		for(;x>0 && i>-1;) {
			int r = red.get(i);
			int c = 0;
			if(j>-1)
				c = colorless.get(j);
			if(r>=c) {
				sum+=r;i--;x--;
			}else {
				sum+=c;
				colorless.remove(j);
				j--;x--;
			}
		}
//		out.println(colorless);
		while(colorless.size()<C) {
			colorless.add(red.get(i--));
		}
		Collections.sort(colorless);
//		out.println(colorless);
		j = C-1;
		for(i=B-1;y>0 && i>-1;) {
			int r = green.get(i);
			int c = 0;
			if(j>-1)
				c = colorless.get(j);
			if(r>=c) {
				sum+=r;i--;y--;
			}else {
				sum+=c;j--;y--;
			}
		}
			
		out.println(sum);
		out.close();
	}
 
	static final int uncal = -1;
	static final long inf = Long.MIN_VALUE;
	static boolean isPalindrome(String s) {
		int l = s.length();
		char[] sa = s.toCharArray();
		for(int i=0;i<l/2;i++) {
			if(sa[i] != sa[l-i-1])
				return false;
		}
		return true;
	}
	static int res = 0;

	static String reverse(String s) {
		int i = s.length();
		StringBuilder sb = new StringBuilder();
		while(i-->0) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	static void merge(StringBuilder sb,Stack<Character> stack) {
		while(!stack.isEmpty())
			sb.append(stack.pop());		
	}
	static String max(String s,String s2) {
		if(s2.length() > s.length())
			return s2;
		return s;
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