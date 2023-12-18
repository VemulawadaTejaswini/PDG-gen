import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] P = new int[N + 1];
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(sc.next());
			P[A[i]] = i;
		}
		long ans = 0;
		TreeSet<Integer> used = new TreeSet<>();
		used.add(-1);
		used.add(N);
		for (int i = 1; i <= N; ++i) {
			int pos = P[i];
			int lo = used.lower(pos);
			int hi = used.higher(pos);
			ans += (long) i * (pos - lo) * (hi - pos);
			used.add(pos);
		}
		System.out.println(ans);
	}
}
