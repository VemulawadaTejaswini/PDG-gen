import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		long ans = 0;

		switch (A) {
		case 1:
			ans += 300000;
			break;
		case 2:
			ans += 200000;
			break;
		case 3:
			ans += 100000;
			break;
		default:
			break;
		}

		switch (B) {
		case 1:
			ans += 300000;
			break;
		case 2:
			ans += 200000;
			break;
		case 3:
			ans += 100000;
			break;
		default:
			break;
		}

		if (A == 1 && B == 1) {
			ans += 400000;
		}

		System.out.println(ans);

	}
}