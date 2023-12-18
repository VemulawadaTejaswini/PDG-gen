import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] T = new int[N];
		int sum = 0;
		for (int i = 0; i < T.length; i++) {
			T[i] = sc.nextInt();
			sum += T[i];
		}
		int M = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < M; i++) {
			ans = sum;
			ans -= T[sc.nextInt() - 1];
			ans += sc.nextInt();
			System.out.println(ans);
		}

		sc.close();
	}
}