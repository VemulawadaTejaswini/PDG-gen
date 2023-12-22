import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	
	static class Point {
		
		int x, y;
		Point(int x, int y) {
			
			this.x = x;
			this.y = y;
		}
	}

	static char[][] grid;
	
	public static void main(String args[]) throws Exception {

		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt() - 1;
		int y = sc.nextInt() - 1;
		int a = sc.nextInt() - 1;
		int b = sc.nextInt() - 1;
		grid = new char[n][m];
		int[][] dist = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			
			grid[i] = sc.next().toCharArray();
			Arrays.fill(dist[i], (int)1e8);
		}
		
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		
		ArrayDeque<Point> q = new ArrayDeque<>();
		q.add(new Point(x, y));
		dist[x][y] = 0;
		
		while(!q.isEmpty()) {
			
			Point p = q.poll();
			//System.out.println(p.x + " " + p.y);
			// 0 cost edges
			for(int i = 0; i < 4; i++) {
				
				int newX = p.x + dx[i];
				int newY = p.y + dy[i];
				
				if(!isSafe(newX, newY))
					continue;
				
				if(dist[newX][newY] > dist[p.x][p.y]) {
					
					dist[newX][newY] = dist[p.x][p.y];
					q.addFirst(new Point(newX, newY));
				}
			}
			
			//1 cost edges
			for(int i = -2; i <= 2; i++) {
				for(int j = -2; j <= 2; j++) {
					
					int newX = p.x + i;
					int newY = p.y + j;
					
					if(!isSafe(newX, newY))
						continue;
					
					if(dist[newX][newY] > dist[p.x][p.y] + 1) {
						
						dist[newX][newY] = dist[p.x][p.y] + 1;
						q.addLast(new Point(newX, newY));
					}
				}
			}
		}
		
		/*for(int[] i : dist) {
			for(int p : i)
				System.out.print(p + " ");
			System.out.println();
				
		}*/
		pr.print(dist[a][b] >= (int)1e8 ? -1 : dist[a][b]);
		pr.close();
	}

	private static boolean isSafe(int x, int y) {

		if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == '#')
			return false;

		return true;
	}

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
}
