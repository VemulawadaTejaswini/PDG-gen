
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int num = (int)Math.pow(2, n);

			Long[] s = new Long[num];

			for (int i = 0; i < num; i++) {
				s[i] = sc.nextLong();
			}

			Arrays.sort(s, Collections.reverseOrder());

			for (int i = 1; i <= n; i++) {
				if (s[(int)Math.pow(2, i - 1) - 1] == s[(int)Math.pow(2, i) - 1]) {
					System.out.println("No");
					return;
				}
			}

			System.out.println("Yes");
		}
	}
}
