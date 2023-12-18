import java.io.*;
import java.util.*;

public class Main {
	private static final boolean local = false;
	private static BufferedReader br;
	private static StringTokenizer st;
	private static PrintWriter output;
	//char c = line.nextToken().charAt(0);

	private static void openFile() throws IOException {
		if (local) {
			String inp = "C:/Users/ztrong/Desktop/AndroidStudioProjects/Java/src/main/java/input.txt";
			String out = "C:/Users/ztrong/Desktop/AndroidStudioProjects/Java/src/main/java/output.txt";
			br = new BufferedReader(new InputStreamReader(new FileInputStream(inp)));
			output = new PrintWriter(new FileOutputStream(out));
		} else {
			br = new BufferedReader(new InputStreamReader(System.in));
			output = new PrintWriter(System.out);
		}
	}

	private static String _next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	private static int nextInt() {
		return Integer.parseInt(_next());
	}

	private static long nextLong() {
		return Long.parseLong(_next());
	}

	private static double nextDouble() {
		return Double.parseDouble(_next());
	}

	private static String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}

	private static final int maxN = (int) 1e2 + 5;
	private static final int maxM = (int) 1e4 + 5;
	private static final int inf = (int) 1e9 + 7;

	private static int N, H, W;
	private static int[] a = new int[maxM];
	private static int[][] res = new int[maxN][maxN];

	private static void init() {

	}

	private static void enter() throws IOException {
		H = nextInt(); W = nextInt();
		N = nextInt();
		for (int i = 1; i <= N; ++i) {
			a[i] = nextInt();
		}
	}

	private static void solve() throws IOException {
		int tmp = 1;
		for (int i = 1; i <= H; ++i) {
			if (i % 2 == 1) {
				for (int j = 1; j <= W; ++j) {
					if (a[tmp] == 0) ++tmp;
					res[i][j] = tmp;
					--a[tmp];
				}
			}
			else {
				for (int j = W; j >= 1; --j) {
					if (a[tmp] == 0) ++tmp;
					res[i][j] = tmp;
					--a[tmp];
				}
			}
		}
		for (int i = 1; i <= H; ++i) {
			for (int j = 1; j <= W; ++j) {
				output.print(res[i][j] + " ");
			}
			output.println();
		}
	}

	public static void main(String[] args) throws IOException {
		openFile();
		init();
		enter();
		solve();
		output.close();
	}
}