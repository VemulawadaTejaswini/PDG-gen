import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		long K = sc.nextLong();

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c != '1') {
				System.out.println(c);
				return;
			}
		}
		System.out.println(1);
	}
}
