import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] S = sc.nextLine().split("");
		int[] cnt = new int[S.length];

		for (int i = 0; i < S.length; i++) {
			if ("R".equals(S[i])) {
				for (int j = i + 1; j < S.length; j++) {
					if ("L".equals(S[j])) {
						cnt[j - (j - i) % 2]++;
						break;
					}
				}
			} else if ("L".equals(S[i])) {
				for (int j = i - 1; j >= 0; j--) {
					if ("R".equals(S[j])) {
						cnt[j + (i - j) % 2]++;
						break;
					}
				}
			}
		}
		Arrays.stream(cnt).forEach(s -> System.out.print(s + " "));
	}
}