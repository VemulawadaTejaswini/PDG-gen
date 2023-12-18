import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static char[] cs = { '.', '#' };

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(sc.next());
		}
		long ans = A[0] - 1;
		int min = 2;
		for (int i = 1; i < N; ++i) {
			if (A[i] == min) {
				++min;
				continue;
			}
			ans += (A[i] - 1) / min;
		}
		System.out.println(ans);
	}
}
