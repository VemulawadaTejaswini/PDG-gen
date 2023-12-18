import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int ans = Integer.parseInt(String.valueOf(n).substring(0, 1)) - 1;

		for (int i = 1; i < String.valueOf(n).length(); i++) {
			ans = ans + 9;
		}

		System.out.println(ans);
	}
}