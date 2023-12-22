import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		setIO();

		int N = ni();
		
		HashMap<String, Integer> m = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String s = f.readLine();
			m.put(s, m.getOrDefault(s, 0) + 1);
		}
		
		out.println("AC x " + m.getOrDefault("AC", 0));
		out.println("WA x " + m.getOrDefault("WA", 0));
		out.println("TLE x " + m.getOrDefault("TLE", 0));
		out.println("RE x " + m.getOrDefault("RE", 0));
		
		f.close();
		out.close();
	}

	static BufferedReader f;
	static PrintWriter out;
	static StringTokenizer st;

	static int ni(StringTokenizer st) {
		return Integer.parseInt(st.nextToken());
	}

	static int ni() throws IOException {
		return Integer.parseInt(f.readLine());
	}

	static StringTokenizer nl() throws IOException {
		return new StringTokenizer(f.readLine());
	}

	static int[] nia(int N) throws IOException {
		StringTokenizer st = nl();
		int[] A = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = ni(st);
		return A;
	}

	static void setIn(String s) throws IOException {
		f = new BufferedReader(new FileReader(s));
	}

	static void setOut(String s) throws IOException {
		out = new PrintWriter(new FileWriter(s));
	}

	static void setIn() {
		f = new BufferedReader(new InputStreamReader(System.in));
	}

	static void setOut() {
		out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	}

	static void setIO(String s) throws IOException {
		setIn(s + ".in");
		setOut(s + ".out");
	}

	static void setIO() {
		setIn();
		setOut();
	}
}
