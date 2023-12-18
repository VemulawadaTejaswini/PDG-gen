
import java.util.Scanner;

public class Main {

	static String s;
	static int x;
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			s = sc.next();
			x = sc.nextInt();

			search("");
		}
	}

	private static void search(String sb) {
		for (char c = 'a'; c <= 'z'; c++) {
			String tmp = sb.toString() + c;
			if (-1 < s.indexOf(tmp)) {
				x--;
				if(x == 0) {
					System.out.println(tmp);
					return;
				} else {
					search(tmp);
				}
			}
		}
	}
}
