import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		boolean isOk = true;
		String[] divide = { "dream", "dreamer", "erase", "eraser" };
		StringBuilder sb = new StringBuilder(S);
		for (int i = S.length(); i > 0;) {
			if (sb.substring(0, i).endsWith(divide[0])) {
				i -= divide[0].length();
			} else if (sb.substring(0, i).endsWith(divide[1])) {
				i -= divide[1].length();
			} else if (sb.substring(0, i).endsWith(divide[2])) {
				i -= divide[2].length();
			} else if (sb.substring(0, i).endsWith(divide[3])) {
				i -= divide[3].length();
			} else {
				isOk = false;
				break;
			}
		}
		System.out.println(isOk ? "YES" : "NO");
		in.close();
	}
}