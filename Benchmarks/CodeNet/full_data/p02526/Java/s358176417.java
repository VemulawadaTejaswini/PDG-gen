import java.io.IOException;
import java.util.BitSet;
import java.util.Scanner;

public class Main {
	private static BitSet S = new BitSet();
	private static BitSet T = new BitSet();

	public static void main(String[] args) throws IOException {
		S.clear();
		T.clear();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-- > 0) {
			S.set(in.nextInt());
		}
		int q = in.nextInt();
		while (q-- > 0) {
			T.set(in.nextInt());
		}
		S.and(T);
		System.out.println(S.cardinality());
		in.close();
	}

}