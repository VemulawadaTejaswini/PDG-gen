import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	static int n,m;
	static char[][] grid;
	public static void main(String[] args) {
		FastScanner in = new FastScanner();
//		PrintWriter out = new PrintWriter(System.out);
		n = in.nextInt();
		m = in.nextInt();
		int startx = in.nextInt()-1, starty = in.nextInt()-1;
		int destx = in.nextInt()-1, desty = in.nextInt()-1;
		grid = new char[n][m];
		for(int i=0;i<n;i++) {
			char[] line = in.next().toCharArray();	
			for(int j = 0;j<m;j++) 
				grid[i][j] = line[j];
		}
		ArrayDeque<Integer> x = new ArrayDeque<Integer>(),y = new ArrayDeque<>();
		x.add(startx);
		y.add(starty);
		int[][] cost = new int[n][m];
		for(int i=0;i<n;i++) Arrays.fill(cost[i], 1_000_000_000);
		cost[startx][starty] = 0;
		int[] dx = {0,0,-1,1};
		int[] dy = {1,-1,0,0};
		while(!x.isEmpty()) {
			int curx = x.removeFirst();
			int cury = y.removeFirst();
			for(int i=0;i<dx.length;i++) {
				int nx = curx+dx[i];
				int ny = cury+dy[i];
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
					if(cost[nx][ny]>cost[curx][cury]+1) {
						cost[nx][ny] = cost[curx][cury]+1;
						x.addLast(nx);
						y.addLast(ny);
					}
				}
			}
		}
		System.out.println(cost[destx][desty]>(int)1e7?-1:cost[destx][desty]);
//		out.close();
	}
	public static boolean legal(int x,int y) {
		if(x<0||x>=n||y<0||y>=m||grid[x][y]=='#') return false;
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
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
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