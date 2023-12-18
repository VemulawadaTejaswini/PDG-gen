import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final int N = scn.nextInt();
			//final int[] v = IntStream.generate(scn::nextInt).limit(N).toArray();

			System.out.println(
					IntStream.generate(scn::nextInt).limit(N)
							.sorted()
							.asDoubleStream()
							.reduce((a, b) -> (a + b) / 2)
							.getAsDouble());
		}
	}
}
