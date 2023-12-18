import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		int day = 0;
		for (int i = 0; i < S.length(); i++) {
			char s = S.charAt(i);
			char t = T.charAt(i);

			if (s == t) {
				day++;
			}
		}
		System.out.println(day);
		sc.close();

	}
}
