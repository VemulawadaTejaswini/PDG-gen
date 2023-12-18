import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int min1 = Integer.MAX_VALUE;
		for (int v : a) {
			if (v < min1)
				min1 = v;
		}
		int min2 = Integer.MAX_VALUE;
		for (int v : a) {
			if (v < min2 && v != min1)
				min2 = v;
		}
		if (min2 == Integer.MAX_VALUE) {
			System.out.println(min1);
			return;
		}
		outer:
		for (int i = min2; i > 0; i--) {
			int count = 0;
			for (int v: a) {
				if (v % i != 0)
					count++;
				if (count > 1)
					continue outer;
			}
			System.out.println(i);
			return;
		}
	}

}