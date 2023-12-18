import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int s[] = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}
		Arrays.sort(s);
		int ans = 9999999;
		for (int i = 0; i < n - k + 1; i++) {
			if (s[i + k - 1] - s[i] < ans) {
				ans = s[i + k - 1] - s[i];
			}
		}
		System.out.println(ans);
	}
}