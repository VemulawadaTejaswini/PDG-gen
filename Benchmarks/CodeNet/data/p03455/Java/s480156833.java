import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	String fileName = "erase";

	public void solve() throws IOException {
		int a = nextInt();
		int b = nextInt();
		int bo = 1;
		if (a % 2 == 0)
			bo = -1;
		if (b % 2 == 0)
			bo = -1;
		if (bo == -1)
			out.print("Even");
		else
			out.print("Odd");
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
