import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		sc.close();
		int l = L;

		int a = 0;
		for (int i = 0; i < N; i++) {
			a += L;
			L++;
		}

		int min = 99999;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int b = a;
			b -= l;
			int c = Math.abs(a - b);
			if (min > c) {
				min = c;
				ans = l;
			}
			l++;
		}
		int ans2 = a - ans;
		System.out.println(ans2);
	}
}
