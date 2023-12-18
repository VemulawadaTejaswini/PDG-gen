import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String params[] = sc.nextLine().split(" ", 3);

		int n = Integer.parseInt(params[0]);
		int a = Integer.parseInt(params[1]);
		int b = Integer.parseInt(params[2]);

		int sum;

		sum = IntStream.rangeClosed(1, n)
		.filter(i -> sumDigits(i) >= a && sumDigits(i) <= b)
		.sum();

		System.out.println(sum);
	}

	private static int sumDigits(int n) {
		if (n == 0) {
			return 0;
		}
		return n%10 + sumDigits(n/10);
	}

}