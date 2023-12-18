import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		int result = -1;
		for (int i = 1; i <= 1000; i++) {
			if (a == Math.floor(i * 0.08) && b == Math.floor(i * 0.10)) {
				result = i;
				break;
			}
		}

		System.out.println(result);
		scan.close();
	}
}