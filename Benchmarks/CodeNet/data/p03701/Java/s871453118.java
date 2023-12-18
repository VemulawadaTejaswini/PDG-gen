import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] s = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
			sum += s[i];
		}
		if (sum % 10 == 0) {
			Arrays.sort(s);
			for (int i = 0; i < n; i++) {
				if (s[i] % 10 != 0) {
					sum = sum - s[i];
					break;
				}
			}
		}
		if (sum % 10 != 0) {
			System.out.println(sum);
		} else {
			System.out.println(0);
		}
	}
}
