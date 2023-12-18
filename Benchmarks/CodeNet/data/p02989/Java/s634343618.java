import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int[] D = IntStream.generate(s::nextInt).limit(N).sorted().toArray();

			int lhs = D[N / 2 - 1];
			int rhs = D[N / 2];

			System.out.println(Math.max(0, rhs - lhs));
		}
	}
}
