import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(), m = sc.nextInt();
		int sh = sc.nextInt() - 1, sw = sc.nextInt() - 1;
		int eh = sc.nextInt() - 1, ew = sc.nextInt() - 1;
		char[][] grid = new char[n][m];
		for (int i = 0; i < n; i++)
			grid[i] = sc.next().toCharArray();
		Deque<int[]> q = new LinkedList();
		q.add(new int[] { sh, sw });
		int[][] dist = new int[n][m];
		int INF = (int) 1e9;
		
		for(int []x:dist)
		Arrays.fill(x, INF);
		dist[sh][sw] = 0;
		while (!q.isEmpty()) {
			int[] curr = q.poll();
			int i = curr[0], j = curr[1];
			for (int di = -2; di <= 2; di++)
				for (int dj = -2; dj <= 2; dj++) {
					int i2 = i + di, j2 = j + dj;
					if (i2 < 0 || i2 >= n || j2 < 0 || j2 >= m || grid[i2][j2] != '.')
						continue;
					int c = Math.abs(di) + Math.abs(dj) == 1 ? 0 : 1;
					if (dist[i][j] + c < dist[i2][j2]) {
						dist[i2][j2] = c + dist[i][j];
						if (c == 0)
							q.addFirst(new int[] { i2, j2 });
						else
							q.addLast(new int[] { i2, j2 });

					}
				}
		}
		out.println(dist[eh][ew]==INF?-1:dist[eh][ew]);
		out.close();

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

		int[] nxtArr(int n) throws IOException {
			int[] ans = new int[n];
			for (int i = 0; i < n; i++)
				ans[i] = nextInt();
			return ans;
		}

	}

	static void sort(int[] a) {
		shuffle(a);
		Arrays.sort(a);
	}

	static void shuffle(int[] a) {
		int n = a.length;
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			int tmpIdx = rand.nextInt(n);
			int tmp = a[i];
			a[i] = a[tmpIdx];
			a[tmpIdx] = tmp;
		}
	}

}
