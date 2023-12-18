import java.util.BitSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final String S = s.next();

			BitSet bs = new BitSet(100000);
			BitSet bs1 = new BitSet(100000);
			BitSet bs0 = new BitSet(100000);
			for (int i = 0; i < S.length(); i++) {
				if (i % 2 == 0) {
					bs1.set(i);
				} else {
					bs0.set(i);
				}
				if (S.charAt(i) == '1')
					bs.set(i);
			}

			bs1.xor(bs);
			bs0.xor(bs);

			System.out.println(Math.min(bs1.cardinality(), bs0.cardinality()));
		}
	}
}
