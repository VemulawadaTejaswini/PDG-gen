import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.length() < 4) {
			System.out.println(0);
			sc.close();
			return;
		}
		int count = 0;
		for (int i = 0; i < s.length() - 3; i++) {
			for (int l = i + 4; l <= s.length(); l++) {
				long lon = Long.parseLong(s.substring(i, l));
				long lon2 = new Long(2019);
				if (lon >= lon2 && lon % 2019 == 0) {
					count++;
				}

			}
		}
		System.out.println(count);
		sc.close();

	}

}