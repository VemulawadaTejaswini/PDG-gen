import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final Long max = 9223372036854775807L;

		String S = sc.next();

		int counter = 0;
		for (int i = 0; i <= S.length() - 1; i++) {
			for (int j = i + 1; j <= S.length(); j++) {
				String tmp = S.substring(i, j);

				if (tmp.length() < 4 || Long.SIZE < tmp.length()) {
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