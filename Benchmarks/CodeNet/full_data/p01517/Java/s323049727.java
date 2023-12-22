import java.util.*;

public class Main {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String... args) {
		while (sc.hasNext()) {
			final int N = sc.nextInt();
			if (N == 0)
				break;
			solve(N);
		}
	}

	private static void solve(final int N) {
		sc.nextLine();
		final String[] lines = new String[N];
		for (int i = 0; i < N; i++)
			lines[i] = sc.nextLine();
		final Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++)
			map.put(lines[i].split(" ", 2)[0], i);
		final int[] powers = new int[N];
		final long[] masks = new long[N];
		for (int i = 0; i < N; i++) {
			final String[] ss = lines[i].split(" ");
			powers[i] = Integer.parseInt(ss[1]);
			masks[i] = 1L << i;
			final int M = Integer.parseInt(ss[2]);
			for (int j = 0; j < M; j++)
				masks[i] |= 1L << map.get(ss[3 + j]);
		}
		System.out.println(powers[0] + dfs(N, 1, masks[0], powers, masks));
	}

	private static int dfs(final int N, final int c, final long used, final int[] powers, final long[] masks) {
		if (c == N)
			return 0;
		int ret = 0;
		if ((used & 1L << c) == 0) {
			ret = dfs(N, c + 1, used | masks[c], powers, masks) + powers[c];
			long rem = 0L;
			for (int k = c + 1; k < N; k++)
				if ((used & 1L << k) == 0)
					rem |= masks[k];
			if ((rem & 1L << c) == 0)
				return ret;
		}
		return Math.max(ret, dfs(N, c + 1, used, powers, masks));
	}

	private static void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}