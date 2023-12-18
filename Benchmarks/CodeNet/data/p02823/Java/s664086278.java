import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int N = 2 * n;
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int ans = 0;
		int min = Math.min(A, B);
		int max = Math.max(A, B);
		if ((B - A) % 2 != 0) {
			if (min - 1 <= N - max) {
				ans = max - 1;
			} else {
				ans = N - min;
			}
		} else {
			ans = (B - A) / 2;
		}
		System.out.println(ans);
	}
}