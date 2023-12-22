import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long X = sc.nextLong();
		long money = 100L;
		long count = 0L;

		for (; ;) {
			count += 1;
			money *= 1.01;

			if (money >= X) {
				break;
			}
		}

		System.out.println(count);
	}

}
