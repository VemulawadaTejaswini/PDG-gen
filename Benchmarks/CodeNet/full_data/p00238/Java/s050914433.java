import java.util.BitSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t;
		BitSet time = new BitSet();
		while ((t = in.nextInt()) > 0) {
			int n = in.nextInt();
			time.clear();
			while (n-- > 0) {
				time.set(in.nextInt(), in.nextInt());
			}
			int size = time.cardinality();
			if (size >= t) {
				System.out.println("OK");
			} else {
				System.out.println(t - size);
			}
		}
	}
}