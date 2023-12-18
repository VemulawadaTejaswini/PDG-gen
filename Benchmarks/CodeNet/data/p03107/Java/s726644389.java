import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int n = S.length();
		while (S.contains("01") || S.contains("10")) {
			S = S.replace("01", "");
			S = S.replace("10", "");
		}

		System.out.println(n - S.length());

		sc.close();
	}
}