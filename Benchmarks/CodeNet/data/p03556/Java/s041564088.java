import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int ans = 0;
		for (int i = 1; i < N; i++) {
			if (i * i <= N) {
				ans = i * i;
			}
		}
		sc.close();
		System.out.println(ans);
	}
}
