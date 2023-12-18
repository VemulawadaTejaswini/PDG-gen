import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int[] s = new int[N+1];
		int sum = 0, min = 0, ans = 0;
		
		for (int i = 0; i < N; i++) {
			s[i] = sc.nextInt();
			sum += s[i];
		}
		
		if (sum % 10 == 0) {
			if (s[0] % 10 != 0) {
				min = s[0];
			}
			for (int i = 0; i < (N - 1); i++) {
				if (min > s[i + 1] && s[i + 1] % 10 != 0) {
					min = s[i + 1];
				}
			}
		}
		
		if (((sum - min) % 10) == 0) {
			ans = 0;
		} else {
			ans = sum - min;
		}
		
		
		System.out.println(ans);

		sc.close();
	}
}
