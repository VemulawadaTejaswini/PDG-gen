import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		boolean result = false;

		StringBuilder sb = new StringBuilder("");

		for (int i = 0; i < 20001; i++) {
			if (S.endsWith("dream" + sb.toString())) {
				sb.insert(0, "dream");
			} else if (S.endsWith("dreamer" + sb.toString())) {
				sb.insert(0, "dreamer");
			} else if (S.endsWith("erase" + sb.toString())) {
				sb.insert(0, "erase");
			} else if (S.endsWith("eraser" + sb.toString())) {
				sb.insert(0, "eraser");
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