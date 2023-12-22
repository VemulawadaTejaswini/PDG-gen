import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		String t = scan.next();

		int q = scan.nextInt();
		String[] p = new String[q];
		for (int i = 0; i < q; i++)
			p[i] = scan.next();

		PtFind f = new PtFind(t, p, false);

		scan.close();
		System.exit(0);
	}
}

class PtFind {
	boolean debug;
	int _p = 97;
	int _m = 1000000000;
	int hash_fault = 0;
	int hash_hit = 0;

	public PtFind(String t, String[] p, boolean d) {
		debug = d;

		boolean[] result = new boolean[p.length];
		int[] length = new int[p.length];
		long[] hash = new long[p.length];
		List<Integer> unresolve = new ArrayList<Integer>();
		for (int i = 0; i < p.length; i++) {
			length[i] = p[i].length();
			hash[i] = getHash(p[i], 0, length[i]);
			unresolve.add(i);
		}

		long[] thash = new long[1001];
		int[] tcalc = new int[1001];
		long[] multi = new long[1001];
		multi[0] = 1;
		for (int i = 1; i < tcalc.length; i++) {
			tcalc[i] = -1;
			multi[i] = multi[i - 1] * _p;
			multi[i] %= _m;
		}
		for (int i = 0; i < length.length; i++) {
			int le = length[i];
			if (le < t.length() && tcalc[le] == -1) {
				tcalc[le] = 0;
				thash[le] = getHash(t, 0, le);
			}
		}

		for (int st = 0; st < t.length(); st++) {
			for (int i = 0; i < length.length; i++) {
				if (result[i])
					continue;

				int le = length[i];
				if (st + le > t.length())
					continue;

				if (tcalc[le] != st) {
					tcalc[le] = st;
					long nh = (thash[le] * _p) + t.charAt(st + le - 1) + _m - ((t.charAt(st - 1) * multi[le]) % _m);
					thash[le] = nh % _m;
					// thash[le] = (thash[le] * _p) + t.charAt(st + le - 1);
					// int mn = (t.charAt(st - 1) * multi[le]) % _m;
					// thash[le] = (thash[le] + _m - mn) % _m;
				}

				if (thash[le] == hash[i]) {
					if (p[i].equals(t.substring(st, st + le))) {
						result[i] = true;
						hash_hit++;
					} else
						hash_fault++;
					if (debug)
						System.out.println(hash_hit + " " + hash_fault + "\t" + result[i] + "\t" + hash[i] + "\t"
								+ thash[le] + "\t" + p[i] + "\t" + t.substring(st, st + le));

				}
			}

		}
		if (!debug)
			for (int i = 0; i < result.length; i++)
				if (result[i])
					System.out.println("1");
				else
					System.out.println("0");
	}

	private long getHash(String s, int start, int length) {
		long ret = 0;
		for (int i = start; i < start + length; i++) {
			ret *= _p;
			ret += s.charAt(i);
			ret %= _m;
		}
		return ret;
	}
}