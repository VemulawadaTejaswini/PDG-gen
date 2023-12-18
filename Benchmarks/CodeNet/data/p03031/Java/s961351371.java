import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int N;

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			N = s.nextInt();
			final int M = s.nextInt();

			List<BitSet> sw = new ArrayList<BitSet>((int) Math.pow(2, N));
			addSw(0, new BitSet(N), sw);

			List<BitSet> ri = new ArrayList<BitSet>((int) Math.pow(2, M));
			for (int i = 0; i < M; i++) {
				final int k = s.nextInt();
				BitSet bs = new BitSet(N);
				for (int j = 0; j < k; j++) {
					bs.set(s.nextInt() - 1, true);
				}
				ri.add(bs);
			}

			for (int i = 0; i < M; i++) {
				final int p = s.nextInt();
				List<BitSet> next = new ArrayList<BitSet>(sw.size());
				for (BitSet bs : sw) {
					BitSet w = (BitSet) bs.clone();
					w.and(ri.get(i));
					if (w.cardinality() % 2 == p) {
						next.add(bs);
					}
				}
				if (next.size() == 0) {
					sw = next;
					break;
				}
			}
			System.out.println(sw.size());
		}
	}

	static void addSw(int n, BitSet bs, List<BitSet> sw) {
		if (n == N) {
			sw.add((BitSet) bs.clone());
			return;
		}

		bs.set(n, true);
		addSw(n + 1, bs, sw);
		bs.set(n, false);
		addSw(n + 1, bs, sw);
	}
}
