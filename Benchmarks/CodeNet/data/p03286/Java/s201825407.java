import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		String ans = "";
		if (n == 0)
			ans = "0";
		while (n != 0) {
			if (n % 2 != 0) {
				ans = "1" + ans;
				if (n < 0)
					n = n / -2 + 1;
				else
					n /= -2;
			} else {
				ans = "0" + ans;
				n /= -2;
			}
		}
		System.out.println(ans);
	}
}
