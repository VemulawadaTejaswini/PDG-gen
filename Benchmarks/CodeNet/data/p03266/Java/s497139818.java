import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int ans = 0;
		if (K%2 != 0) {
			int a = N/K;
			ans = a*a*a;
		} else {
			int a= N/K;
			int b = (N + K/2)/K;
			ans = a*a*a + b*b*b;
		}
		System.out.println(ans);
	}
}
