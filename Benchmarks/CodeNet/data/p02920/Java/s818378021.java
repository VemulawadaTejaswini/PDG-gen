
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int num = (int)Math.pow(2, n);

			Long[] s = new Long[num + 1];

			for (int i = 1; i <= num; i++) {
				s[i] = sc.nextLong();
			}

			Arrays.sort(s, Collections.reverseOrder());

			if (s[1] == s[2]) {
				System.out.println("No");
				return;
			}
			for (int i = 1; i <= n; i++) {
				if (s[i] == s[(int)Math.pow(2, i)]) {
					System.out.println("No");
					return;
				}
			}

			System.out.println("Yes");
		}
	}
}
