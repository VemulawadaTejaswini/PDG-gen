import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		boolean result = false;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 2000; i++) {
			if (S.startsWith(sb.toString() + "dream")) {
				sb.append("dream");
                if (S.startsWith(sb.toString() + "eraser")) {
                    sb.append("eraser");
                } else if (S.startsWith(sb.toString() + "erase")) {
                    sb.append("erase");
                } else if (S.startsWith(sb.toString() + "er")) {
                    sb.append("er");
                }
			} else if (S.startsWith(sb.toString() + "erase")) {
				sb.append("erase");
                if (S.startsWith(sb.toString() + "r")) {
                    sb.append("r");
                }
			} else {
              break;
            }

			if (S.equals(sb.toString())) {
				result = true;
				break;
			}
		}

		System.out.println(result ? "YES" : "NO");
	}
}