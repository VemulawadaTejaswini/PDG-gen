import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int res = 0;
		if (a < b) {
			res = a;
		} else {
			res = b;
		}

		if (c < d) {
			res += c;
		} else {
			res += d;
		}

		System.out.println(res);
	}
}