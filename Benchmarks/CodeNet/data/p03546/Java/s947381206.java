
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		InputReader in = new InputReader(new BufferedInputStream(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		TaskB solver = new TaskB();
//		long t1 = System.currentTimeMillis();
		solver.solve(1, in, out);
		out.flush();
//		long t2 = System.currentTimeMillis();
//		System.err.println(t2 - t1);
		out.close();

	}
}

class Seg implements Comparable<Seg> {
	double a;
	double b;

	public Seg(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public int compareTo(Seg t) {
		return Double.compare(a, t.a);
	}

}

class TaskB {

	int id[];
	int sz[];
	double eps = 1e-10;
	long INF = (long) 1e15;
	int c[][];

	void solve(int testNumber, InputReader in, PrintWriter pw) {
		int h = in.nextInt();
		int w = in.nextInt();
		c = new int[10][10];
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				c[i][j] = in.nextInt();
			}
		}
		int a[][] = new int[h][w];
		int dist[][] = new int[10][10];
		for (int x[] : dist) {
			Arrays.fill(x, (int) 1e9);
		}
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				if (i == j) {
					dist[i][j] = 0;
				} else {
					dist[i][j] = Math.min(c[i][j], dist[i][j]);
				}
			}
		}
		for (int j = 0; j < 10; ++j) {
			for (int i = 0; i < 10; ++i) {
				for (int k = 0; k < 10; ++k) {
					dist[i][k] = Math.min(dist[i][k], dist[i][j] + dist[j][k]);
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < h; ++i) {
			for (int j = 0; j < w; ++j) {
				int u = in.nextInt();
				if (u != -1) {
					ans += dist[u][1];
				}
			}
		}
		pw.println(ans);
	}

	boolean inter(long rec1[], long rec2[]) {
		if (rec1[0] < rec2[0]) {
			if (rec2[0] <= rec1[2]) {
				if (rec1[1] < rec2[1]) {
//					System.err.println(rec2[1] + " " + rec1[3]);
					if (rec2[1] <= rec1[3]) {
						return true;
					}
				} else {
					if (rec1[1] <= rec2[3]) {
						return true;
					}
				}
			}
		} else {
			if (rec1[0] <= rec2[2]) {
//				System.err.println("hello");
				if (rec1[1] < rec2[1]) {
					if (rec2[1] <= rec1[3])
						return true;
				} else {
					if (rec1[1] <= rec2[3])
						return true;
				}

			}
		}
		return false;
	}

	long ar(long rec[]) {
		long l = Math.abs(rec[0] - rec[2]) + 1;
		long b = Math.abs(rec[1] - rec[3]) + 1;
		return l * b;

	}

	long pow(int n, int m) {
		if (m == 0)
			return 1;
		long ans = pow(n, m / 2);
		ans = (ans * ans);
		if (m % 2 == 1) {
			ans = (ans * n);
		}
		return ans;
	}

	double pow(double n, int m) {
		if (m == 0)
			return 1;
		double ans = pow(n, m / 2);
		ans = (ans * ans);
		if (m % 2 == 1) {
			ans = (ans * n);
		}
		return ans;
	}
}

class InputReader {
	BufferedReader br;
	StringTokenizer st;

	public InputReader(InputStream in) {
		br = new BufferedReader(new InputStreamReader(in));
		st = null;
	}

	public String next() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}