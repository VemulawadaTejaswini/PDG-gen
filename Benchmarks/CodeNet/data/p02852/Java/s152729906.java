// javac Main.java && java _

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) { new Main(); }
	FS in = new FS();
	PrintWriter out = new PrintWriter(System.out);


	
	Main() {
		int n = in.nextInt();
		int m = in.nextInt();
		char[] S = in.next().toCharArray();

		TreeSet<Integer> jump = new TreeSet<>();
		for (int i = 0; i <= n; i++)
			if (S[i] == '0')
				jump.add(i);

		int idx = 0;
		ArrayList<Integer> moves = new ArrayList<>();

		boolean lose = false;
		while (true) {
			if (idx == n)
				break;

			int to = jump.floor(idx + m);
			if (to == idx) {
				lose = true;
				break;
			}
			else {
				moves.add(to - idx);
				idx = to;
			}
		}

		if (lose)
			out.println(-1);
		else {
			idx = n;
			moves.clear();
			while (idx > 0) {
				int to = jump.ceiling(idx - m);
				moves.add(idx - to);
				idx = to;
			}
			int sz = moves.size();
			for (int i = sz - 1; i >= 0; i--)
				out.print(moves.get(i) + " ");
			out.println();
		}	

		out.close();
	}
	
	

	int min(int a, int b) { if (a < b) return a; return b; }	
	int max(int a, int b) { if (a > b) return a; return b; }	
	long min(long a, long b) { if (a < b) return a; return b; }	
	long max(long a, long b) { if (a > b) return a; return b; }	

	boolean z(int x) { if (x == 0) return true; return false; }
	boolean z(long x) { if (x == 0) return true; return false; }
	
	class FS {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch (Exception e) {}
			} return st.nextToken();
		}
		int nextInt() { return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
		double nextDouble() { return Double.parseDouble(next()); }
	}
}

