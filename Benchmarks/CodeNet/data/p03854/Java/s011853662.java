import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		while (S.length() > 0) {
			if (S.endsWith("dreamer")) {
				S = S.substring(0, S.length() - "dreamer".length());
			}
			else if (S.endsWith("eraser")) {
				S = S.substring(0, S.length() - "eraser".length());
			}
			else if (S.endsWith("dream")) {
				S = S.substring(0, S.length() - "dream".length());
			}
			else if (S.endsWith("erase")) {
				S = S.substring(0, S.length() - "erase".length());
			}
			else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

}
