import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static String[] card;
	static HashSet<String> set;
	static int N;

	static void rec(int[] p, int d) {
		if (d == p.length) {
			String all = "";
			for (int i = 0; i < d; ++i) {
				all += card[p[i]];
			}
			set.add(all);
			return;
		}
		OUT: for (int i = 0; i < N; ++i) {
			for (int j = 0; j < d; ++j) {
				if (p[j] == i) continue OUT;
			}
			p[d] = i;
			rec(p, d + 1);
		}
	}

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			int K = sc.nextInt();
			if (N == 0) break;
			card = new String[N];
			for (int i = 0; i < N; ++i) {
				card[i] = sc.next();
			}
			set = new HashSet<String>();
			int[] p = new int[K];
			rec(p, 0);
			System.out.println(set.size());
		}
	}

}