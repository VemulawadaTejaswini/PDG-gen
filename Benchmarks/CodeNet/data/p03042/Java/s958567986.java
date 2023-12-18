import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int front, back;
		boolean YYMMflg = false;
		boolean MMYYflg = false;

		front = Integer.valueOf(S.substring(0, 2));
		back = Integer.valueOf(S.substring(2, 4));

		// YYMM
		if (0 <= front && front <= 99 && 1 <= back && back <= 12) {
			YYMMflg = true;
		}

		// MMYY
		if (0 <= back && back <= 99 && 1 <= front && front <= 12) {
			MMYYflg = true;
		}

		if (YYMMflg && MMYYflg) {
			System.out.println("AMBIGUOUS");
		} else if (YYMMflg) {
			System.out.println("YYMM");
		} else if (MMYYflg) {
			System.out.println("MMYY");
		} else {
			System.out.println("NA");
		}
	}
}
