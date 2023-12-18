
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

			if (s[0] == s[1]) {
				System.out.println("No");
				return;
			}
			if (s[1] == s[n]) {
				System.out.println("No");
				return;
			}

			System.out.println("Yes");
		}
	}
}
