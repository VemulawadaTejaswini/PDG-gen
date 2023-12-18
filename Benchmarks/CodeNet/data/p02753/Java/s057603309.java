import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String isDiff = "No";

		char station = S.charAt(0);
		for (int i = 1; i < 3; i++) {
			char temp = S.charAt(i);
			if (station != temp) {
				isDiff = "Yes";
			}
		}

		System.out.println(isDiff);

		sc.close();
	}
}