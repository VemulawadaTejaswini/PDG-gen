import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		final String n = sc.next();

		String[] ar = n.split("");

		int max = 0;
		for (int i = 0; i < n.length(); i++) {
			final int m = Integer.parseInt(ar[i]);
			if (i == 0) {
				max = m;
				continue;
			}
			if (m > max) {
				max = m;
			}

		}

		String result = null;
		for (int j = 0; j < n.length(); j++) {
			if (j == 0) {
				result = String.valueOf(max);
				continue;
			}
			result = result + String.valueOf(max);
		}
		System.out.println(result);

	}

}