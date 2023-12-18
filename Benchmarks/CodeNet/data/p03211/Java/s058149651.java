
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int X = 0;
		int diff_min = Math.abs(Integer.parseInt(S.substring(0, 3)) - 753);
		int diff;
		for (int i = 1; i < S.length() - 2; i++) {
			X = Integer.parseInt(S.substring(i, i + 3));
			diff = Math.abs(X - 753);
			if (diff < diff_min) {
				diff_min = diff;
			}
		}
		System.out.println(diff_min);
	}
}
