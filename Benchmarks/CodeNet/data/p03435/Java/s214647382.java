import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	String fileName = "prizes";

	public void solve() throws IOException {
		int[][] c = new int[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				c[i][j] = nextInt();
		int[] a = new int[3];
		int[] b = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = c[i][0];
			for (int j = 1; j < 3; j++)
				a[i] = Math.min(a[i], c[i][j]);
		}
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				c[i][j] -= a[i];
		boolean ans = true;
		for (int j = 0; j < 3; j++) {
			for (int i = 1; i < 3; i++)
				if (c[i][j] != c[i - 1][j])
					ans = false;
		}
		if (ans)
			out.println("Yes");
		else
			out.println("No");
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