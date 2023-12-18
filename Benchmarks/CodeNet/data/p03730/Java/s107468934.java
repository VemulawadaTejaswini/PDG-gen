import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int multi = 0;

		String msg = "NO";
		for (int i = 0; i < b; i++) {
			multi += a;
			if (multi % b == c) {
				msg = "YES";
				break;
			}
		}
		System.out.println(msg);

	}
}