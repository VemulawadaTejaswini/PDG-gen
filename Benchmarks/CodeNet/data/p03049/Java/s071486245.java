import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int a = 0;
		int b = 0;
		int ab = 0;
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 1; j < s.length(); j++) {
				// 文字列の中にあるABをカウント
				if (s.charAt(j - 1) == 'A' && s.charAt(j) == 'B') {
					ans++;
				}
			}
			// 最後がA最初がBの場合 = ab
			// 最後がAの場合 = a
			// 最初がBの場合 = b
			if (s.charAt(s.length() - 1) == 'A') {
				if (s.charAt(0) == 'B') {
					ab++;
				} else {
					a++;
				}
			} else if (s.charAt(0) == 'B') {
				b++;
			}
		}
		// 最後がaのものがない場合、abが有っても組が作れない
		if (a == 0 && ab > 0) {
			ab--;
			a++;
		}

		if (b == 0 && ab > 0) {
			ab--;
			b++;
		}

		int result = ans + ab + Math.min(a, b);
		System.out.println(result);
	}
}