import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int a = Integer.parseInt(s.substring(0, 2));
		int b = Integer.parseInt(s.substring(2, 4));

		if (a <= 12 && a >= 1 && b <= 12 && b >= 1) {
			System.out.println("AMBIGUOUS");
		} else if (a <= 12 && a >= 1) {
			System.out.println("MMYY");
		} else if (b <= 12 && b >= 1) {
			System.out.println("YYMM");
		} else {
			System.out.println("NA");
		}

		sc.close();

	}
}