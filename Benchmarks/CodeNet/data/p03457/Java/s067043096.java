import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	String fileName = "erase";

	public void solve() throws IOException {
		int n = nextInt();
		int t[] = new int[n + 1];
		int x[] = new int[n + 1];
		int y[] = new int[n + 1];
		t[0] = 0;
		x[0] = 0;
		y[0] = 0;
		for (int i = 1; i < n + 1; i++) {
			t[i] = nextInt();
			x[i] = nextInt();
			y[i] = nextInt();
		}
		boolean b = true;
		for (int i = 0; i < n; i++) {
			int time = t[i + 1] - t[i];
			int dx = Math.abs(x[i + 1] - x[i]);
			int dy = Math.abs(y[i + 1] - y[i]);
//			out.println(dx + " " + dy + " " + time);
			int d = dx + dy;
			if ((time - d < 0) || (time - d) % 2 == 1) {
				b = false;
			}
		}
		if (b)
			out.println("Yes");
		else
			out.println("No");
	}

	public void run() {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			out = new PrintWriter(System.out, true);
			// out = new PrintWriter(fileName + ".out");
			// br = new BufferedReader(new FileReader(fileName + ".in"));
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
