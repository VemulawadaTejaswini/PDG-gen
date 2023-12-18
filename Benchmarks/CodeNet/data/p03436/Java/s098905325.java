

import java.io.*;
import java.util.*;

public class Main {
	public static int[] dx = {1, 0, -1, 0};
	public static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) {
		
		
		
		
		MyScanner sc = new MyScanner();
		out = new PrintWriter(new BufferedOutputStream(System.out));
				
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		int dotCounter = 0;
		int anser = -1;
		
		char[][] lmap = new char[H][W];
		for (int i = 0; i < lmap.length; i++) {
			lmap[i] = sc.next().toCharArray();
			
			for (int j = 0; j < lmap[i].length; j++) {
				if (lmap[i][j]=='.') {
					dotCounter++;
				}
			}
			
		}
		
		
		
		
		Queue<Point> queue = new ArrayDeque<>(); 
		Point point = new Point(0,0,0);
		queue.add(point);

		while (!queue.isEmpty()) {
			Point p = queue.poll();
			int x = p.x;
			int y = p.y;
			int d = p.d;
			
			lmap[x][y] = 'x';
			
			if (x==H-1 && y==W-1) {
				anser = dotCounter - d - 1;		
				break;
			}
			
			
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				int nd = d + 1;
				
				if (nx>=0 && nx<H && ny>=0 && ny<W) {
					if (lmap[nx][ny]=='.') {
						Point nPoint = new Point(nx, ny, nd);
						queue.add(nPoint);
					}
				}
			}
		}
		
		
		
		
		out.println(anser);

		out.close();
	}
	
	
	public static class Point{
		private int x;
		private int y;
		private int d;
		public Point(int x, int y, int d) {
			this.x = x;
			this.y = y;
			this.d = d;
		}
	}

	
	
	

	//-----------http://codeforces.com/blog/entry/7018---------------------------------
	public static PrintWriter out;

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
	//--------------------------------------------------------

}

