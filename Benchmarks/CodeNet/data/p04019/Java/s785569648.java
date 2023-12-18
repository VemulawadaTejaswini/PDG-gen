import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// シミュレーション
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		boolean[] news = new boolean[4];
		for (int i = 0; i < S.length(); i++) {
			char here = S.charAt(i);
			switch (here) {

			case 'N':
				news[0] = true;
				continue;
			case 'E':
				news[1] = true;
				continue;
			case 'W':
				news[2] = true;
				continue;
			case 'S':
				news[3] = true;
				continue;
			}
		}

		// NS,EW
		if (!(news[0] && news[3])) {
			System.out.println("No");
		} else if (!(news[1] && news[2])) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
