import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int cnt = 0;

		int l = 0;
		int r = s.length() - 1;

		while (l <= r) {
			if (!s.substring(l, l + 1).equals(s.substring(r, r + 1))) {
				cnt++;
			}
			l++;
			r--;
		}

		System.out.println(cnt);
		sc.close();
	}
}