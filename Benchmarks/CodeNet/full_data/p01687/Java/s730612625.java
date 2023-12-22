
import java.util.*;
import java.io.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		String d = sc.next() + "________";
		String ans = "";
		HashSet<String> aidunyan = azunyan();
		for (int i=0;i<d.length() - 8;i++) {
			if (aidunyan.contains(d.substring(i, i+8))) {
				ans += "AIZUNYAN";
				i += 7;
			} else {
				ans += d.charAt(i);
			}
		}
		System.out.println(ans);
	}

	HashSet<String> azunyan() {
		int[] az = {'A', 'I', 'D', 'U', 'N', 'Y', 'A', 'N'};
		sort(az);
		Permutation p = new Permutation(az.length);
		p.set(az);
		HashSet<String> set = new HashSet<String>();
		while (p.hasNext()) {
			int[] pure = p.next();
			set.add(ar2str(pure));
		}
		return set;
	}
	
	String ar2str(int[] ar) {
		String s = "";
		for (int i : ar) {
			s += (char)i;
		}
		return s;
	}

	class Permutation {
		private final int size;

		public Permutation(int size) {
			if (size <= 0) throw new IllegalArgumentException();
			this.size = size;
			source = new int[size];
		}
		
		void set(int[] source) {
			System.arraycopy(source, 0, this.source, 0, size);
		}

		int[] source;
		boolean isFirst = true;

		public boolean hasNext() {
			if (isFirst) {
				isFirst = false;
				return true;
			}

			int n = source.length;
			for (int i = n - 1; i > 0; i--) {
				if (source[i - 1] < source[i]) {
					int j = n;
					while (source[i - 1] >= source[--j]);
					swap(source, i - 1, j);
					reverse(source, i, n);
					return true;
				}
			}
			reverse(source, 0, n);
			return false;
		}

		public int[] next() {
			return source;
		}

		private void swap(int[] is, int i, int j) {
			int t = is[i];
			is[i] = is[j];
			is[j] = t;
		}

		private void reverse(int[] is, int s, int t) {
			while (s < --t) swap(is, s++, t);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}