import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		char[] chAr = new char[S.length()];

		int counter = 0;
		for (int i = 0; i <= S.length() - 1; i++) {
			for (int j = i; j <= S.length(); j++) {
				String tmp = S.substring(i, j);

				if (tmp.length() < 4) {
				} else {
					long current = Long.parseLong(tmp);
					if (current % 2019 == 0) {
						counter++;
					}
				}
			}
		}

		System.out.println(counter);
	}

}