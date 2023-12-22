import java.util.*;

public class Main {
	final static long MODULO = 1_000_000_000 + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());
		int[] D = new int[N];
		for (int i = 0; i < N; ++i) {
			D[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(D);
		long ans = 1;
		int s = 0;
		for (int i = 0; i < N; ++i) {
			while (s < i && D[s] < D[i] - T) {
				++s;
			}
			ans = (ans * (i - s + 1)) % MODULO;
		}
		System.out.println(ans);

	}
}