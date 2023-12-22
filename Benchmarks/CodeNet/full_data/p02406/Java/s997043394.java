import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int num = Integer.parseInt(line);

		StringBuilder ans = new StringBuilder();

		for (int i = 3; i <= num; i++) {
			if (i % 3 == 0) {
				ans.append(" " + i);
			} else if (i % 10 == 3) {
				ans.append(" " + i);
			}

		}

		String d = ans.toString();
		System.out.println(d);
	}

	/**
	 * 途中！答え間違ってる！？問題文を読み直すこと！
	 *
	 */

}

