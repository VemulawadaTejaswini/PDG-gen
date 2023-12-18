import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	String fileName = "prizes";
	int[][] s;
	int h;
	int w;

	public void solve() throws IOException {
		h = nextInt();
		w = nextInt();
		s = new int[h][w];
		int minus = 1;
		for (int i = 0; i < h; i++) {
			String ss = nextToken();
			for (int j = 0; j < w; j++)
				if (ss.charAt(j) == '#') {
					s[i][j] = 0;
					minus++;
				} else
					s[i][j] = 1;
		}
		// int ans = dfs(0, 0, 0);
		int ans = h * w - (w + h - 2) - minus;
		if (ans < 0)
			out.println(-1);
		else {
			out.print(ans);
		}

	}

	public int dfs(int i, int j, int k) {
		int a1 = Integer.MAX_VALUE;
		int a2 = Integer.MAX_VALUE;
		if (i + 1 < h && s[i + 1][j] == 1)
			a1 = dfs(i + 1, j, k + 1);
		if (j + 1 < w && s[i][j + 1] == 1)
			a2 = dfs(i, j + 1, k + 1);
		if (i == h - 1 && j == w - 1)
			return (k);
		else
			return Math.min(a1, a2);

	}

	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out, true);
			solve();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	BufferedReader br;
	StringTokenizer in;
	static PrintWriter out;

	public String nextToken() throws IOException {
		while (in == null || !in.hasMoreTokens()) {
			in = new StringTokenizer(br.readLine());
		}
		return in.nextToken();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}

	public long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

}