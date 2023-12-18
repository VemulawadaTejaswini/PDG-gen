import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int ans = 0;

		int nLen = String.valueOf(n).length();

		String answer = String.valueOf(Integer.parseInt(String.valueOf(n)
				.substring(0, 1)) - 1);

		for (int i = 1; i < nLen; i++) {
			answer = answer + "9";
		}

		for (int i = 0; i < nLen; i++) {
			ans = ans
					+ Integer.parseInt(String.valueOf(answer).substring(i,
							i + 1));
		}
		System.out.println(ans);
	}
}