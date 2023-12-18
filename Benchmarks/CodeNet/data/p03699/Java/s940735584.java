import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int s[] = new int[n];
		int sSum = 0;

		for (int i = 0; i < n; i++) {
			s[i] = scanner.nextInt();
			sSum += s[i];
		}

		if (sSum % 10 != 0) {
			System.out.println(sSum);
			return;
		} else {
			Arrays.sort(s);
			for (int i = 0; i < s.length; i++) {
				if (s[i] % 10 == 0) {
					continue;
				} else {
					sSum -= s[i];
					System.out.println(sSum);
					return;
				}
			}
		}

		System.out.println(0);

	}
}
