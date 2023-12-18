import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			ans += Math.min(x * 2, Math.abs(x - K) * 2);
		}
		System.out.println(ans);
		sc.close();
	}

}