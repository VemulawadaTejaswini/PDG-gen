import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int[] H = IntStream.generate(s::nextInt).limit(N).toArray();
			int max = H[0];
			int ret = 1;

			for (int i = 1; i < N; i++) {
				if (max <= H[i]) {
					ret++;
					max = H[i];
				}
			}
			System.out.println(ret);
		}
	}
}
