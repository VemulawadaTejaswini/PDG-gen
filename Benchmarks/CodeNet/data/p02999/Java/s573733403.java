import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int a = scan.nextInt();

		int ans = 10;

		if (x < a) {
			ans = 0;
		}

		System.out.println(ans);

	}
}