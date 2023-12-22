
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class S implements Comparable<S> {
		String key;
		int value;

		S(String key, int value) {
			this.key = key;
			this.value = value;
		}

		public int compareTo(S t) {
			return value - t.value;
		}

	}

	String sed(String input, String alpha, String beta) {
		String ret = "";
		for (;;) {
			if (input.indexOf(alpha) < 0) {
				ret += input;
				break;
			}
			int ind = input.indexOf(alpha);
			ret += input.substring(0, ind);
			ret += beta;
			input = input.substring(ind + alpha.length());

		}
//		System.err.println(input2+" "+alpha+" "+beta + " "+ret);
		return ret;

	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			String a[] = new String[n];
			String b[] = new String[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.next();
				b[i] = sc.next();
			}

			String start = sc.next();
			String end = sc.next();

			PriorityQueue<S> q = new PriorityQueue<S>();

			q.add(new S(start, 0));

			HashSet<String> hs = new HashSet<String>();

			for (;;) {
				if (q.isEmpty()) {
					System.out.println(-1);
					break;
				}
				S s = q.poll();
//				System.out.println(s.key+" "+s.value);
				if (s.key.equals(end)) {
					System.out.println(s.value);
					break;
				}

				if (s.key.length() >= end.length()) {
					continue;
				}

				if (hs.contains(s.key)) {
					continue;
				}
				hs.add(s.key);

				for (int i = 0; i < n; i++) {
					String next = sed(s.key, a[i], b[i]);
					if (hs.contains(next)) {
						continue;
					}
					q.add(new S(next, s.value + 1));
				}

			}

		}
	}

	public static void main(String[] a) {
		Main m = new Main();
		m.run();
	}
}