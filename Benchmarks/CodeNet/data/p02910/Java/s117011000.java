import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] s = scanner.next().toCharArray();

			boolean flgKisuu = true;
			for (int i = 0; i < s.length; i+=2) {
				// 以下に該当したらNo!
				if (s[i] == 'L') {
					flgKisuu = false;
					break;
				}
			}
			boolean flgGuusu = true;
			for (int i = 1; i < s.length; i+=2) {
				// 以下に該当したらNo!
				if (s[i] == 'R') {
					flgGuusu = false;
					break;
				}
			}
			if (flgGuusu && flgKisuu) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
