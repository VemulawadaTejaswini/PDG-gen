
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(euclideanAlgorithm(x, y));
	}

	public static int euclideanAlgorithm(int x, int y) {
		int tmp;
		while (true) {
			tmp = x % y;
			if (tmp == 0) {
				return y;
			}
			x = y;
			y = tmp;
		}
	}
}

