import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if ("AKIHABARA".equals(s) || "KIHABARA".equals(s) || "AKIHBARA".equals(s) || "AKIHABRA".equals(s)
				|| "AKIHABAR".equals(s) || "KIHBARA".equals(s) || "KIHABRA".equals(s) || "KIHABAR".equals(s)
				|| "AKIHBRA".equals(s) || "AKIHBAR".equals(s) || "AKIHABR".equals(s) || "AKIHBRA".equals(s)
				|| "AKIHBR".equals(s) || "AKIHABR".equals(s) || "KIHBR".equals(s) || "KIHBAR".equals(s)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}