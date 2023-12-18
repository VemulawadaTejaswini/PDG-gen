import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		StringBuilder sb  =new StringBuilder(S);
		String[] words = {"dreamer", "dream", "eraser", "erase"};

		while (sb.length() > 0) {
			boolean hitFlg = false;

			for (int i=0; i<words.length; i++) {
				if (sb.toString().endsWith(words[i])) {
					sb.delete(sb.length()-words[i].length(), sb.length());
					hitFlg = true;
					break;
				}
			}
			if (!hitFlg) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

}
