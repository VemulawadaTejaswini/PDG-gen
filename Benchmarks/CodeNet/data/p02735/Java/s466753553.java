import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int h=fs.nextInt(), w=fs.nextInt();
		boolean[][] board=new boolean[w][h];
		for (int y=0; y<h; y++) {
			char[] line=fs.next().toCharArray();
			for (int x=0; x<w; x++) board[x][y]=line[x]=='#';
		}
		int[] dx= {1, 0}, dy= {0, 1};
		ArrayDeque<Integer> xs=new ArrayDeque<>(), ys=new ArrayDeque<>();
		int[][] dist=new int[w][h];
		for (int x=0; x<w; x++) Arrays.fill(dist[x], Integer.MAX_VALUE/2);
		dist[0][0]=board[0][0]?1:0;
		xs.add(0); ys.add(0);
		while (!xs.isEmpty()) {
			int x=xs.removeFirst(), y=ys.removeFirst();
			for (int d=0; d<2; d++) {
				int nx=x+dx[d], ny=y+dy[d];
				if (nx>=w||ny>=h) continue;
				int cost=(!board[x][y]&&board[nx][ny]?1:0);
				if (dist[nx][ny]<=dist[x][y]+cost) continue;
				dist[nx][ny]=dist[x][y]+cost;
				if (cost==0) {
					xs.addFirst(nx);
					ys.addFirst(ny);
				}
				else {
					xs.addLast(nx);
					ys.addLast(ny);
				}
			}
		}
		System.out.println(dist[w-1][h-1]);
	}

	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");

		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) {
				a[i]=nextInt();
			}
			return a;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}

}
