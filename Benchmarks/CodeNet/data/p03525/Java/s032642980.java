import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n > 24) {
			System.out.println(0);
			return;
		}
		int[] a = new int[n];
		Arrays.setAll(a, i -> s.nextInt());
		BitSet b = new BitSet(25);
		b.set(0);
		b.set(24);

		int r = 0;
		loop:
		for (int f = 0, e = 1 << n; f < e; ++f) {
			b.clear(1, 24);
			for (int i = 0; i < n; ++i) {
				int j = ((1 << i) & f) > 0 ? 24 - a[i] : a[i];
				if (b.get(j))
					continue loop;
				b.set(j);
			}

			int v = b.stream().skip(1)
					.map(o -> o - b.previousSetBit(o - 1))
					.min().getAsInt();
			r = Math.max(r, v);
		}
		System.out.println(r);
	}
}
