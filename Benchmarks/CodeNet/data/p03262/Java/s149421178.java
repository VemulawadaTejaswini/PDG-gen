import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line1 = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		long[] points = Stream.of(sc.nextLine().split(" ", 0)).mapToLong(Long::parseLong).toArray();
		sc.close();
		long ans = Math.abs(points[0] - line1[1]);
		Main main = new Main();
		for (int i = 1; i < line1[0]; i++) {
			ans = main.GCD(ans, Math.abs(points[i] - line1[1]));
		}
		System.out.println(ans);
	}

	public long GCD(long num1, long num2) {
		if (num2 == 0) {
			return num1;
		} else {
			return GCD(num2, num1 % num2);
		}
	}


}