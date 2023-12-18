import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();// s
		long M = sc.nextLong();// c
		long ans = 0;
		if (N >= 2 * M) {
			System.out.println(M / 2);
			return;
		}
		ans += N;
		M -= 2 * N;
		ans += M / 4;
		System.out.println(ans);
	}
}