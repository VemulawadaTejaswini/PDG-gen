import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	String[] strDir = { "E", "N", "S", "W" };

	void run() {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		while (true) {
			int[] t = new int[6];
			for (int i = 0; i < 6; ++i) {
				t[i] = sc.nextInt();
			}
			int p = sc.nextInt();
			int q = sc.nextInt();
			Arrays.sort(t);
			boolean f = true;
			for (int i = 0; i < 6; ++i) {
				if (t[i] != 0)
					f = false;
			}
			if (f)
				break;
			pw.println(solve(t, p, q));
		}
		pw.close();
	}

	String solve(int[] t, int p, int q) {
		int[] ord = new int[6];
		for (int i = 0; i < 6; ++i) {
			ord[i] = i;
		}
		String ans = null;
		do {
			int[] num = new int[6];
			for (int i = 0; i < 6; ++i) {
				num[i] = t[ord[i]];
			}
			int[] N = makeN(num);
			StringBuilder sb = new StringBuilder();
			if (!check(N)) {
				continue;
			}
			out: while (N[0] != 0 || N[1] != 0 || N[2] != 0) {
				for (int dir = 0; dir < 4; ++dir) {
					if (roll(num, dir)[0] >= 0 && check(makeN(roll(num, dir)))) {
						sb.append(strDir[dir]);
						num = roll(num, dir);
						N = makeN(num);
						continue out;
					}
				}
				if (!(N[0] == 0 && N[1] == 0 && N[2] == 0)) {
					throw new AssertionError();
				}
			}
			if (ans == null) {
				ans = sb.toString();
			} else {
				if (ans.compareTo(sb.toString()) > 0) {
					ans = sb.toString();
				}
			}
		} while (nextPermutation(ord));
		if (ans == null) {
			return "Impossible";
		} else
			return ans.substring(p - 1, q);
	}

	int[] makeN(int[] num) {
		int[] N = new int[3];
		for (int i = 0; i < 3; ++i) {
			N[i] = num[i] + num[5 - i];
		}
		return N;
	}

	int[] roll(int[] num, int dir) {
		int[] ret = new int[6];
		for (int i = 0; i < 6; ++i) {
			ret[i] = num[i];
		}
		if (dir == 0) {
			ret[0] = num[2];
			ret[2] = num[5];
			ret[5] = num[3];
			ret[3] = num[0];
		} else if (dir == 1) {
			ret[0] = num[4];
			ret[4] = num[5];
			ret[5] = num[1];
			ret[1] = num[0];
		} else if (dir == 2) {
			ret[0] = num[1];
			ret[1] = num[5];
			ret[5] = num[4];
			ret[4] = num[0];
		} else if (dir == 3) {
			ret[0] = num[3];
			ret[3] = num[5];
			ret[5] = num[2];
			ret[2] = num[0];
		}
		--ret[0];
		return ret;
	}

	boolean check(int[] N) {
		if (!(N[0] <= N[1] + N[2]))
			return false;
		if (!(N[1] <= N[0] + N[2] + 1))
			return false;
		if (!(N[2] <= N[0] + N[1] + 1))
			return false;
		return true;
	}

	boolean nextPermutation(int[] ord) {
		int n = ord.length;
		int i = n - 1;
		while (i > 0 && ord[i - 1] >= ord[i]) {
			--i;
		}
		if (i == 0)
			return false;
		int j = i;
		while (j + 1 < n && ord[i - 1] < ord[j + 1]) {
			++j;
		}
		int tmp = ord[j];
		ord[j] = ord[i - 1];
		ord[i - 1] = tmp;
		int t = n - 1;
		int s = i;
		while (t - s > 0) {
			tmp = ord[t];
			ord[t] = ord[s];
			ord[s] = tmp;
			++s;
			--t;
		}
		return true;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}