import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		double ans1 = 0;
		for (int i = 0; i < N; i++) {
			ans1 += 1 / (double) sc.nextInt();
		}
		sc.close();
		double ans2 = (1 / ans1);
		System.out.println(ans2);
	}
}