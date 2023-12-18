import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();

		double ArrayA[] = new double[a];

		double ans = 0.0;

		for (int i = 0; i < a; i++) {
			ans += 1/sc.nextDouble();
		}

		ans = 1/ans;

		System.out.println(ans);

	}
}
