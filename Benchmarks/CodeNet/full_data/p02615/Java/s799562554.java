import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Long[] A = new Long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		sc.close();

		// 降順にソート
		Arrays.sort(A, Collections.reverseOrder());
		long ans = 0;
		ans += A[0];
		for (int i = 0; i < N - 2; i++) {
			long next = A[i / 2 + 1];
			ans += next;
		}
		System.out.println(ans);
	}
}
