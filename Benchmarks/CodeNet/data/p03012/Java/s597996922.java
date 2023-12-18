import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int[] W = IntStream.generate(s::nextInt).limit(N).toArray();

			int tmp = 0;
			for (int i = 0; i < N; i++) {
				tmp += W[i];
			}
			final int sum = tmp;

			int si = 0;
			int pre = Integer.MAX_VALUE;
			for (int i = 0; i < N; i++) {
				si += W[i];
				int cur = Math.abs(sum - si * 2);
				if (cur > pre) {
					System.out.println(pre);
					break;
				} else {
					pre = cur;
				}
			}
		}
	}
}
