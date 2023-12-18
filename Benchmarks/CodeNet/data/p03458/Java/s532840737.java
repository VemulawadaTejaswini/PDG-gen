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
		int k = nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		char[] c = new char[n];
		// (0;0)-(k;k) -white
		for (int i = 0; i < n; i++) {
			x[i] = nextInt();
			y[i] = nextInt();
			c[i] = nextToken().charAt(0);
		}
		int ans = 0;
		int des = 0;

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				// for white
				// out.println("i=" + i + " j=" + j);
				des = 0;
				for (int z = 0; z < n; z++) {
					if (((((x[z] + i) / k + (y[z] + j) / k) % 2) == 0) && c[z] == 'W')
						des++;
					if (((((x[z] + i) / k + (y[z] + j) / k) % 2) == 1) && c[z] == 'B')
						des++;
					// out.println(((x[z] + i)) + " " + ((y[z] + j)) + " " + c[z] + " " + des);

				}
				// out.println(i + " " + j + " " + des + " W");
				ans = Math.max(ans, des);
				// // for black
				des = 0;
				for (int z = 0; z < n; z++) {
					if (((((x[z] + i) / k + (y[z] + j) / k) % 2) == 0) && c[z] == 'B')
						des++;
					if (((((x[z] + i) / k + (y[z] + j) / k) % 2) == 1) && c[z] == 'W')
						des++;
					// out.println(((x[z] + i)) + " " + ((y[z] + j)) + " " + c[z] + " " + des);
				}
				ans = Math.max(ans, des);
				// out.println(i + " " + j + " " + des + " B");
			}
		}
		out.println(ans);
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
