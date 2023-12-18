import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}
		sc.close();

		Arrays.parallelSort(s);

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += s[i];
		}

		if (sum % 10 == 0) {
			for (int i = 0; i < n; i++) {
				if (s[i] % 10 != 0) {
					System.out.println(sum - s[i]);
					return;
				}
			}
			System.out.println(0);
		} else {
			System.out.println(sum);
		}
	}
}
