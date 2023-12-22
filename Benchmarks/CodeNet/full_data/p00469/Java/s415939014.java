import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Lining up the cards
 */
public class Main {

	static int n;
	static int k;
	static int[] cards;
	static List<int[]> perms;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			n = parseInt(line);
			if (n == 0) break;

			k = parseInt(br.readLine());
			cards = new int[n];

			for (int i = 0; i < n; i++) {
				cards[i] = parseInt(br.readLine());
			}

			perms = new ArrayList<>();
			perm(0, 0, new int[k]);

			Set<Integer> ns = new HashSet<>();

			for (int[] p : perms) {

				int num = 0;
				for (int i = 0; i < k; i++) {
					if (p[i] < 10) {
						num *= 10;
					} else {
						num *= 100;
					}
					num += p[i];
				}
				ns.add(num);
			}

			System.out.println(ns.size());

		}
	}

	//?????????????????????
	static void perm(int i, int c, int[] p) {
		if (c == k) {
			perm2(0, new int[k], p);
			return;
		}
		if (i < n) {
			int[] _p;
			//
			_p = Arrays.copyOf(p, p.length);
			_p[c] = cards[i];
			perm(i + 1, c + 1, _p);
			//
			_p = Arrays.copyOf(p, p.length);
			perm(i + 1, c, _p);
		}
	}

	//????????\?????????
	static void perm2(int i, int[] q, int[] p) {
		if (i == k) {
			perms.add(q);
			return;
		}
		q[i] = p[i];
		for (int j = i; j >= 0; j--) {
			int[] _q = Arrays.copyOf(q, q.length);
			int tmp = _q[j];
			_q[j] = _q[i];
			_q[i] = tmp;
			perm2(i + 1, _q, p);
		}
	}
}