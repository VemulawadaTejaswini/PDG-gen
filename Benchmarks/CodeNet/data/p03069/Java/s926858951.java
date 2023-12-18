import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int countW = 0;
		int countB = 0;
		int countC = 0;
		String black = "#";
		String white = ".";
		int ans = 0;

		for (int i = 1; i < s.length(); i ++) {
			if (String.valueOf(s.charAt(i)).equals(white)) {
				countW++;
				if (String.valueOf(s.charAt(i - 1)).equals(black)) {
					countC++;
				}
			}
		}
		if (countC != 0) {
			ans = Math.min(countW, n - countW - 1);
		}
		System.out.println(ans);
	}

}
