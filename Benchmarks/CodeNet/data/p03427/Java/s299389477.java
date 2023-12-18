import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int ans = Integer.parseInt(String.valueOf(n).substring(0, 1)) - 1;

		int nLen = String.valueOf(n).length();

		for (int i = 1; i < nLen; i++) {
			ans = ans + 9;
		}

		if ( ans == -1) {
			ans = 0;
		}
		System.out.println(ans);
	}
}