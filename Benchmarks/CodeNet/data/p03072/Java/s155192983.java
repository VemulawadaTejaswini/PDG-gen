import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String S = sc.next();
		int N = S.length();
		String color[] = new String[N];
		int ans = 0;
		int count = 0;
		for (int i = 0; i < N; i++) {
			color[i] = S.substring(i, i + 1);
		}

		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				if (color[i].equals("0")) {
					count++;
				}
			} else {
				if (color[i].equals("1")) {
					count++;
				}
			}
		}
		ans = count;
		count = 0;

		for (int i = 0; i < N; i++) {
			if (i % 2 != 0) {
				if (color[i].equals("0")) {
					count++;
				}
			} else {
				if (color[i].equals("1")) {
					count++;
				}
			}
		}

		ans = Math.min(ans, count);

		sc.close();

		System.out.println(ans);
	}
};