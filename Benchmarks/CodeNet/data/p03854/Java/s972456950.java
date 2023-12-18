import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean flg = true;

		while (flg) {
			if (S.startsWith("dream" + "eraser")) {
				S = S.substring("dream".length() + "eraser".length());
			} else if (S.startsWith("dream" + "erase")) {
				S = S.substring("dream".length() + "erase".length());
			} else if (S.startsWith("dreamer")) {
				S = S.substring("dreamer".length());
			} else if (S.startsWith("eraser")) {
				S = S.substring("eraser".length());
			} else if (S.startsWith("dream")) {
				S = S.substring("dream".length());
			} else if (S.startsWith("erase")) {
				S = S.substring("erase".length());
			}

			if (!(S.startsWith("dreamer") ||
				S.startsWith("eraser")  ||
				S.startsWith("dream")   ||
				S.startsWith("erase"))) {
				flg = false;
			}
            System.gc();
		}


		System.out.println(S.length() == 0 ? "YES" : "NO");
	}
}
