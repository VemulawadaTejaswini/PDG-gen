import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		if (s.length() >= 4) {
			if (s.substring(0,4).equals("YAKI")) {
				System.out.print("Yes");
			} else {
				System.out.print("No");
			}
		} else {
			System.out.print("No");
		}
	}
}
