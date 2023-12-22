
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	long[] map = new long[26];
	long[] dec = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000,
			100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L,
			10000000000000L }; // a

	boolean rec(int[] permutation, int depth, boolean used[]) {
		// System.err.println(depth);
		// System.err.print(depth+" ");
	//	System.err.println(Arrays.toString(permutation));
		if (depth == permutation.length) {
//			 System.err.println(Arrays.toString(permutation));
			return true;
		}
		if (depth == -1) {
			return false;
		}
		
		int i;
		for (i = permutation[depth] + 1; i <= 9; i++) {
			if (!used[i]) {
				if(permutation[depth] != -1){
					used[permutation[depth]]=false;
				}
				permutation[depth] = i;
				used[i] = true;
				depth++;
				return rec(permutation, depth, used);
			}
		}
		used[permutation[depth]] = false;
		permutation[depth] = -1;
		depth--;
		return rec(permutation, depth, used);
	}

	boolean dfs(int[] permutation) {
		boolean[] used = new boolean[10];
		int depth;
		for (int i = 0; i < permutation.length; i++) {
			if (permutation[i] == -1) {
				depth = i;
				return rec(permutation, i, used);
			} else {
				used[permutation[i]] = true;
			}
		}
		depth = permutation.length - 1;
		return rec(permutation, depth, used);
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			String data[] = new String[n];
			for (int i = 0; i < n; i++) {
				data[i] = sc.next();
			}

			boolean[] used = new boolean[26];

			int pat = 0;

			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			for (int i = 0; i < n; i++) {
				for (char ch : data[i].toCharArray()) {
					if (!used[ch - 'A']) {
						hm.put(ch, pat);
						pat++;
					}
					used[ch - 'A'] = true;
				}
			}
			boolean[] nz = new boolean[pat];
			long mat[] = new long[pat];
			for (int i = 0; i < n; i++) {
				if (data[i].length() > 1) {
					nz[hm.get(data[i].charAt(0))] = true;
				}
				for (int pl = 0; pl < data[i].length(); pl++) {
					int d = hm.get(data[i].charAt(pl));

					if (i != n - 1) {
						mat[d] += dec[data[i].length() - 1 - pl];
					} else {
						mat[d] -= dec[data[i].length() - 1 - pl];
					}
				}
			}
			// System.out.println(Arrays.toString(mat));
			int permutation[] = new int[pat];
			for (int i = 0; i < pat; i++) {
				permutation[i] = -1;
			}
			long res = 0;
			for (;;) {
				if (!dfs(permutation)) {
					break;
				}
				boolean cnt = false;
				for (int i = 0; i < pat; i++) {
					if (nz[i]) {
						if (permutation[i] == 0) {
							cnt = true;
							continue;
						}
					}
				}
				if (cnt) {
					continue;
				}
				long sum = 0;
				for (int i = 0; i < permutation.length; i++) {
					sum += permutation[i] * mat[i];
				}
				if (sum == 0) {
//					System.out.println(Arrays.toString(permutation));
					res++;
				}
			}
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}