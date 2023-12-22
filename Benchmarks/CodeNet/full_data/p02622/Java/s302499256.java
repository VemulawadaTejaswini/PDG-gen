
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!s.substring(i, i + 1).equals(t.substring(i, i + 1)))
				ans++;
		}
		System.out.println(ans);

	}

}
