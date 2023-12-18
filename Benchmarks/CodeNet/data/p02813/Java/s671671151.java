import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private static <T extends Comparable<T>> boolean nextPermutation(List<T> l) {
		for (int i = l.size() - 2; i >= 0; i--) {
			// 辞書順に並んでいるところを探す
			if (l.get(i).compareTo(l.get(i + 1)) < 0) { // l[i] < l[i+1]
				int idx = i + 1;
				T min = l.get(i + 1);
				// l[i]より大きくて、そのうち最小を、i+1以降で探す
				for (int j = i + 1; j < l.size(); j++) {
					if (l.get(j).compareTo(l.get(i)) > 0) {
						if (l.get(j).compareTo(min) < 0) {
							idx = j;
							min = l.get(j);
						}
					}
				}

				Collections.swap(l, i, idx);
				Collections.sort(l.subList(i + 1, l.size()));
				return true;
			}
		}
		return false;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		List<Integer> P = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			P.add(sc.nextInt());
		}
		List<Integer> Q = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			Q.add(sc.nextInt());
		}

		sc.close();

		List<Integer> l = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			l.add(i);
		}

		int n = 1;
		int a = 0;
		int b = 0;
		do {

			if (l.equals(P)) {
				a = n;
			}
			if (l.equals(Q)) {
				b = n;
			}
			n++;

		} while (nextPermutation(l));

		out.println(Math.abs(a - b));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
