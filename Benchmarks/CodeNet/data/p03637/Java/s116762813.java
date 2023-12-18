import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int four = 0;
		int odd = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a % 4 == 0) {
				four++;
			} else if (a % 2 == 1) {
				odd++;
			}
		}
		if ((four + odd == n && four >= odd - 1) || four >= odd) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
