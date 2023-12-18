import java.util.Scanner;

public class Main {

	public static int VALUE = 10 ^ 9 + 7;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		int count = 1;

		for (int i = 1; i <= num; i++) {
			count *= i;
			count %= VALUE;
		}
		System.out.println(count);
	}
}
