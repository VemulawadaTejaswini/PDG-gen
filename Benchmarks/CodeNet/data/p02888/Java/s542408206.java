
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	FastScanner in;
	PrintWriter out;

	void solve() {
		int n = in.nextInt();
		ArrayList<Integer> lines = new ArrayList<Integer>();
		while (n-- > 0) {
			lines.add(in.nextInt());
		}
		Collections.sort(lines);

		int answer = 0;
		for (int i = 0; i < lines.size(); i++) {
			for (int j = i + 1; j < lines.size(); j++) {
				for (int k = j + 1; k < lines.size(); k++) {
					if (lines.get(i) >= lines.get(j) + lines.get(k)) {
						break;
					}
					if (lines.get(j) >= lines.get(k) + lines.get(i)) {
						break;
					}
					if (lines.get(k) >= lines.get(i) + lines.get(j)) {
						break;
					}
					answer++;
				}
			}

		}

		out.println(answer);

	}

	void run() {
		try {
			in = new FastScanner(new File("Main.in"));
			out = new PrintWriter(new File("Main.out"));

			solve();

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	void runIO() {

		in = new FastScanner(System.in);
		out = new PrintWriter(System.out);

		solve();

		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return null;
				st = new StringTokenizer(s);
			}
			return st.nextToken();
		}

		boolean hasMoreTokens() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return false;
				st = new StringTokenizer(s);
			}
			return true;
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
	}

	public static void main(String[] args) {
		new Main().runIO();
	}
}
