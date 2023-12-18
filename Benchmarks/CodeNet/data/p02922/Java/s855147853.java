import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int ans = 0;
		int kt = 1;

		if (B == 1) {
			System.out.println(1);
			return;
		}

		for (int i = 1; i <= A; i++) {
			if (kt - 1 + A >= B) {
				ans++;
				break;
			} else {
				ans++;
				kt += A-1;
			}
		}
		System.out.println(ans);
	}
}
