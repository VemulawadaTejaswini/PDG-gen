import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int point[] = new int[a];

		IntStream.range(0, a).forEach(i -> point[i] = sc.nextInt());

		for (int i = 0; i < a; i++) {
			int sum = 0;
			int be = 0;
			int cu = 0;
			for (int j = 0; j < a; j++) {
				if (i == j) {
					continue;
				}
				cu = point[j];
				sum += Math.abs(be - cu);
				be = point[j];
			}
			sum += Math.abs(cu - 0);

			System.out.println(sum);
		}

	}
}