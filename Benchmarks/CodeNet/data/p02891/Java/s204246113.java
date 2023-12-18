import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int K = in.nextInt();
		long ans = 0;
		int index = 0;
		while (index < S.length() - 1) {
			int right = index + 1;
			for (int i = right; i < S.length(); i++) {
				if (S.charAt(i) != S.charAt(index)) {
					right = i - 1;
					break;
				}
			}
			ans += (right - index + 1) / 2;
			index += right == index ? 1 : right - index;
		}
		if (S.length() - 3 > 0 && S.charAt(S.length() - 1) == (S.length() - 2)) {
			ans += 1;
			ans *= K - 1;
		} else {
			ans *= K;
		}
		System.out.println(ans);
		in.close();
	}
}