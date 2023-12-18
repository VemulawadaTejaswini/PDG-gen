import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	HashMap<List<Integer>, Integer> memo = new HashMap<>();

	private int rec(int i, int rest) {
		List<Integer> memoKey = Arrays.asList(i, rest);

		if (memo.containsKey(memoKey)) {
			return memo.get(memoKey);
		}

		int ans;
		if (rest == 0) {
			ans = 0;
		} else if (i == hiki.size()) {
			ans = Integer.MAX_VALUE >> 1;
		} else if (hiki.get(i) > rest) {
			ans = rec(i + 1, rest);
		} else {
			int a = 1 + rec(i, rest - hiki.get(i));
			int b = rec(i + 1, rest);
			ans = Math.min(a, b);
		}

		memo.put(memoKey, ans);
		return ans;

	}

	int N;
	ArrayList<Integer> hiki;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();

		hiki = new ArrayList<>();

		hiki.add(1);
		for (int i = 1; Math.pow(6, i) <= N; i++) {
			hiki.add((int) Math.pow(6, i));
		}
		for (int i = 1; Math.pow(9, i) <= N; i++) {
			hiki.add((int) Math.pow(9, i));
		}

		hiki.sort(Comparator.reverseOrder());
		System.err.println(hiki);
		out.println(rec(0, N));

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
