import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int cnt = 0;
		while (S.contains("01") || S.contains("10")) {
			if (S.contains("01")) {
				S = S.replaceFirst("01", "");
				cnt = cnt + 2;
			} else {
				S = S.replaceFirst("10", "");
				cnt = cnt + 2;
			}
		}

		System.out.println(cnt);

		sc.close();
	}
}
