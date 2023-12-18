import java.util.*;
import java.io.*;

static class Point{
		int x;
		int y;
		public Point(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
public class Main{
	
	static int w,h;
	static String [][]grid;
	static int counter=0;
	static int dp[][];
	
	public static int tr(Point a) {
		
		try {
			if((a.x==(w-1))&&(a.y==(h-1))) 
				return counter++;
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		
			
		if(!valid(a))
			return -(int)1e9;
		
//		System.out.println("point : x : "+a.x+" y :"+a.y);
		Point down=new Point(a.x,a.y+1);
		Point right=new Point(a.x+1,a.y);
		
		try {
			if(dp[a.x][a.y]!=-1) {
				return dp[a.x][a.y];
			}
		}catch (Exception e) {
//			System.out.println("wrong!");
		}
		tr(down);
		tr(right);
//		dp[a.x][a.y]=tr(down);
//		dp[a.x][a.y]=tr(left);
		return (int) (counter%(1e9+7));
	}

	public static boolean valid(Point a) {
		
		try {
			if(grid[a.y][a.x]!=null) {
//				
				if(grid[a.y][a.x].equals("#")) 
					return false;
				
				if(grid[a.y][a.x].equals(".")) 
					return true;

					
			}
		}catch (Exception e) {

			return false;
			
		}
		
		return false;
	}
	public static void print(String [][]grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
	public static void main (String[]args) throws IOException {
		 
		
		
		Scanner sc=new Scanner (System.in);
		PrintWriter pw=new PrintWriter(System.out);
		
		
		h=sc.nextInt();
		w=sc.nextInt();
		dp=new int [h][w];
		
		grid=new String[h][w];
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				grid[i][j]=sc.next();
				
			}
		}
//		for(int i=0;i<h;i++) {
//			for(int j=0;j<w;j++) {
//				dp[i][j]=-1;
//				
//			}
//		}
		
//		print(grid);
//		for (int i = 0; i < h; i++) {
//			for (int j = 0; j < w; j++) {
//				pw.print(" i: "+i+" j:"+j+"-"+ tr(new Point(i,j)));
//				counter=0;
//			}
//		}
		pw.print( tr(new Point(0,0)));
		counter=0;
//		pw.print(valid(new Point(0,0)));
		pw.close();
		
	}
	static class Scanner {
		BufferedReader br;
		StringTokenizer st;
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}
	}
	
}