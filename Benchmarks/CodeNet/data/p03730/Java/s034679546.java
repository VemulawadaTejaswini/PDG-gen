import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int mod = A % B;
		boolean ans = false;

		for (int i = 2; i <= B; i++) {
			int tmp = A * i % B;
			if (tmp == C) {
				ans = true;
				break;
			}
			if (mod == tmp) {
				break;
			}
		}
		if (ans) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
