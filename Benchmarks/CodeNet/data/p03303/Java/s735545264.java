import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String w = scan.next();
		int Nb = Integer.valueOf(w);

		String result = "";
		String a = "";

		int n = S.length() / Nb;
		a = S.substring(0, 1);
		result = a;
		for (int i = 1; i < n + 1; i++) {

			if (Nb * i == S.length()) {
				a = S.substring(Nb * i);
			} else {
				a = S.substring(Nb * i, Nb * i + 1);
			}

			result = result + a;
		}

		System.out.println(result);

	}
}
