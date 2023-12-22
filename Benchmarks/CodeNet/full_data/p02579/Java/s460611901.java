import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	static int n,m;
	static char[][] grid;
	public static void main(String[] args) {
		FastReader in = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		n = in.nextInt();
		m = in.nextInt();
		int startx = in.nextInt(), starty = in.nextInt();
		int destx = in.nextInt(), desty = in.nextInt();
		grid = new char[n][m];
		for(int i=0;i<n;i++) {
			grid[i] = in.next().toCharArray();	
		}
		ArrayDeque<Integer> x = new ArrayDeque<Integer>(),y = new ArrayDeque<>();
		x.add(startx);
		y.add(starty);
		int[][] cost = new int[n][m];
		for(int i=0;i<n;i++) Arrays.fill(cost[i], (int)1e9);
		cost[startx][starty] = 0;
		int[] dx = {0,0,-1,1};
		int[] dy = {1,-1,0,0};
		while(!x.isEmpty()) {
			int curx = x.removeFirst();
			int cury = y.removeFirst();
			for(int i=0;i<dx.length;i++) {
				int nx = curx+dx[0];
				int ny = cury+dy[0];
				if(!legal(nx,ny)) continue;
				if(cost[nx][ny]>cost[curx][cury]) {
					cost[nx][ny] = cost[curx][cury];
					x.addFirst(nx);
					y.addFirst(ny);
				}
			}
			for(int nx=curx-2;nx<curx+3;nx++) {
				for(int ny=cury-2;ny<cury+3;ny++)
				{
					if(!legal(nx,ny)) continue;
					if(cost[nx][ny]>cost[curx][cury]) {
						cost[nx][ny] = cost[curx][cury];
						x.addFirst(nx);
						y.addFirst(ny);
					}
				}
			}
		}
		out.println(cost[destx][desty]==(int)1e9?-1:cost[destx][desty]);
		out.close();
	}
	public static boolean legal(int x,int y) {
		if(x>=0||x<n||y>=0||y<m||grid[x][y]=='#') return false;
		return true;
	}
	static final Random random=new Random();
	//	static void ruffleSort(Pair[] a) {
	//		int n=a.length;//shuffle, then sort 
	//		for (int i=0; i<n; i++) {
	//			int oi=random.nextInt(n);
	//			Pair temp=a[oi];
	//			a[oi]=a[i]; a[i]=temp;
	//		}
	//		Arrays.sort(a);
	//	}
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	static void ruffleSort(char[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n);
			char temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	static class FastReader 
	{ 
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException  e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 

		double nextDouble() 
		{ 
			return Double.parseDouble(next()); 
		} 

		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 

		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
	}
}

//class Pair implements Comparable<Pair>{
//    int a;
//    int b;
//    public Pair(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//    public int compareTo(Pair o) {
//        if(this.a==o.a)
//            return this.b - o.b;
//        return this.a - o.a;
//    }   
//}