import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a + b + c;

		int max = Math.max(a, b);
		max = Math.max(max, c);

		int ans = 0;

		int ded = max * 3;
		int ded2 = (max + 1) * 3;

		if (ded % 2 == sum % 2) {
			ans = (ded - sum) / 2;
		} else if (ded2 % 2 == sum % 2) {
			ans = (ded2 - sum) / 2;
		}

		System.out.println(ans);
	}
}
