import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int cubeSize = S.length();

		while (true) {
			S = S.replaceAll("01", "");
			S = S.replaceAll("10", "");
			if (!S.matches(".*01.*") && !S.matches(".*10.*")) {
				break;
			}
		}

		System.out.println(cubeSize - S.length());
	}
}