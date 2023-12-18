import java.util.Scanner;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) throws Exception {
		Main main = new Main();

		try (Scanner scan = new Scanner(System.in)) {
			main.yymmOrMmyy(scan);
		}
	}

	private void yymmOrMmyy(Scanner scan) {
		String s = scan.next();

		int f = Integer.valueOf(s.substring(0, 2));
		int l = Integer.valueOf(s.substring(2, 4));
		boolean yOkF = true, yOkL = true;

		if (f > 12 || f < 1) {
			yOkF = false;
		}
		if (l > 12 || l < 1) {
			yOkL = false;
		}
		if (yOkF) {
			if (yOkL) {
				System.out.println("AMBIGUOUS");
			} else {
				System.out.println("MMYY");
			}
		} else {
			if (yOkL) {
				System.out.println("YYMM");
			} else {
				System.out.println("NA");
			}
		}

	}

	private void changingACharchter(Scanner scan) {
		scan.nextInt();
		int k = scan.nextInt();
		char[] s = scan.next().toCharArray();

		s[k - 1] = Character.toLowerCase(s[k - 1]);
		System.out.println(new String(s));

	}

}
