import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();

		int[] L = new int[N];

		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}

		int now = 0;
		int ans = 0;

		for (int i = 0; i < N && now <= X; i++) {
			now += L[i];
			ans = i + 1;
		}

		System.out.println(ans);

	}
}
