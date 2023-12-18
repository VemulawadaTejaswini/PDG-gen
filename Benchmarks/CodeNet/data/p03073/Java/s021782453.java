import java.util.Scanner;

//AtCoder Beginner Contest 124
//C	Coloring Colorfully
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		sc.close();

		int ans0 = 0;

		if (S.length() > 1) {
			char pre = '0';
			for (int i = 0; i < S.length(); i++) {
				char c = S.charAt(i);
				if (pre == c) {
					ans0++;
					if (c == '0') {
						pre = '1';
					} else {
						pre = '0';
					}
				} else {
					pre = c;
				}
			}
		}

		int ans1 = 0;

		if (S.length() > 1) {
			char pre = '1';
			for (int i = 0; i < S.length(); i++) {
				char c = S.charAt(i);
				if (pre == c) {
					ans1++;
					if (c == '0') {
						pre = '1';
					} else {
						pre = '0';
					}
				} else {
					pre = c;
				}
			}
		}

		int ans = Math.min(ans0, ans1);

		System.out.print(ans);
	}
}
