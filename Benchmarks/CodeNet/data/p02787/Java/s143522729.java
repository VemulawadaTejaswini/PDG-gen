import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int n = sc.nextInt();
			List<Magic> list = new ArrayList<Magic>();
			for (int i = 0; i < n; i++) {
				list.add(new Magic(sc.nextInt(), sc.nextInt()));
			}

			System.out.println(calcDP(list, h));

		}
	}

	static long calcDP(List<Magic> list, int hp) {
		Collections.sort(list, new Comparator<Magic>() {
			@Override
			public int compare(Magic a, Magic b) {
				return a.a < b.a ? -1 : 1;
			}
		});

		int minA = list.get(0).a;
		int maxA = list.get(list.size() - 1).a;

		Long[] dp = new Long[hp + maxA];

		dp[minA] = Long.valueOf(list.get(0).b);

		for (int d = minA; d < hp + maxA; d++) {
			for (Magic magic : list) {
				if (d - magic.a >= 0 && dp[d - magic.a] != null && (dp[d] == null || dp[d - magic.a] + magic.b < dp[d])) {
					dp[d] = dp[d - magic.a] + magic.b;
				}
			}
		}

		Long minMp = null;
		for (int d = hp; d < hp + maxA; d++) {
			if (dp[d] != null && (minMp == null || dp[d] < minMp)) {
				minMp = dp[d];
			}
		}

		return minMp;

	}
}

class Magic {
	int a;
	int b;
	Magic(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
