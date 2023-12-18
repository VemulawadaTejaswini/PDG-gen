import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

//		String[] s = new String[n];
//		int[] p = new int[n];
		Pair[] sp = new Pair[n];
		for (int i = 0; i < n; i++) {
//			s[i] = sc.next();
//			p[i] = sc.nextInt();
			sp[i] = new Pair(sc.next(), sc.nextInt(), i);
		}
		Arrays.sort(sp);
		
		for (Pair e : sp) {
			pr.println(e.i + 1);
		}
	}

	static class Pair implements Comparable<Pair> {
		String a;
		int b;
		int i;

		Pair(String a, int b, int i) {
			this.a = a;
			this.b = b;
			this.i = i;
		}

		@Override
		public int compareTo(Pair o) {
			if (a.equals(o.a)) {
				return Integer.compare(o.b, b);
			}

			return a.compareTo(o.a);
		}

		@Override
		public int hashCode() {
			return Integer.hashCode(b);
		}

		@Override
		public boolean equals(Object obj) {
			Pair o = (Pair) obj;
			return a == o.a && b == o.b;
		}

		@Override
		public String toString() {
			// [xxx, xxxx]
			StringBuilder stmp = new StringBuilder(32);
			stmp.append('[');
			stmp.append(a);
			stmp.append(',');
			stmp.append(' ');
			stmp.append(b);
			stmp.append(']');

			return stmp.toString();
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);
			
		solve();
			
		pr.close();
		sc.close();
	}

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
