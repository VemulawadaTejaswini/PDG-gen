import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		long[] a = new long[n];
		// 偶数＋偶数＝偶数　奇数＋奇数＝偶数
		int odd = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] % 2 != 0) {
				odd++;
			}
		}
		if (odd % 2 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
