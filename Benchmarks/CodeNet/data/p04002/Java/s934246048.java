import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static void solve() {
		int h = in.nextInt();
		int w = in.nextInt();
		int n = in.nextInt();
		HashMap<Pair<Integer, Integer>,Integer> map = new HashMap<>();

		int[] dx = { 0, 1, 1, 1, 0,-1,-1,-1, 0};
		int[] dy = { 1, 1, 0,-1,-1,-1, 0, 1, 0};

		for (int i=0; i<n; i++) {
			int y = in.nextInt() - 1;
			int x = in.nextInt() - 1;
			for (int k=0; k<9; k++) {
				int ny = y + dy[k];
				int nx = x + dx[k];
				if (ny <= 0 || nx <= 0 || h <= ny+1 || w <= nx+1) continue;
				Pair<Integer, Integer> p = new Pair<>(ny, nx);
				map.put(p, map.getOrDefault(p, 0) + 1);
			}
		}

		long[] cnt = new long[10];

		for (Pair<Integer, Integer> p : map.keySet()) {
			cnt[map.get(p)]++;
		}

		long sum = 0;
		for (int i=1; i<10; i++) {
			sum += cnt[i];
		}

		out.println((long)(h-2)*(w-2) - sum);
		for (int i=1; i<10; i++) {
			out.println(cnt[i]);
		}
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		solve();
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}

class Pair <A extends Comparable<? super A>, B extends Comparable<? super B>> implements Comparable<Pair<A, B>> {
	A fst; B snd;

	public Pair(A fst, B snd) {
		this.fst = fst;
		this.snd = snd;
	}

	public int compareTo(Pair<A, B> p) {
		if (fst.compareTo(p.fst) != 0) return fst.compareTo(p.fst);
		return snd.compareTo(p.snd);
	}

	public boolean equals(Object o) {
		Pair p = (Pair)o;
		return fst.equals(p.fst) && snd.equals(p.snd);
	}

	public int hashCode() {
		return Objects.hash(fst, snd);
	}

	public String toString() {
		return "(" + fst.toString() + "," + snd.toString() + ")";
	}
}