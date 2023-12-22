import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();
		if (n == 0) {
			System.out.println(x);
			return;
		}
		int[] pArray = new int[100];
		for (int i = 0; i < 100; i++) {
			pArray[i] = 0;
		}
		int p = 0;
		for (int i = 0; i < n; i++) {
			p = sc.nextInt();
			pArray[p - 1] = 1;
		}
		int ans = 101;

		for (int i = x - 1; i < 100; i++) {
			if (pArray[i] == 0) {
				ans = i + 1;
				break;
			}
		}
		for (int i = x - 1; i >= 0; i--) {
			if (pArray[i] == 0) {
				if (Math.abs(x - ans) < Math.abs(x - (i + 1))) {
					break;
				}
				ans = i + 1;
				break;
			}
			if (i == 0 && Math.abs(x - ans) >= x) {
				ans = 0;
			}
		}
		System.out.println(ans);
	}
}