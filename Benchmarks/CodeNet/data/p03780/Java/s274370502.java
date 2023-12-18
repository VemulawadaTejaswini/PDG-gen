import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();

		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);

		int necessary = 0;
		for (int i = 0; i < N; i++) {
			int ai = A[i];
			if (ai >= K) {
				necessary++;
				continue;
			}
			Set<Integer> subSet = new HashSet<Integer>();
			subSet.add(ai);
			outer: for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				if (A[j] > K) {
					break;
				}
				List<Integer> l = new ArrayList<>();
				for (Integer n : subSet) {
					int a = n + A[j];
					if (a >= K && a - ai < K) {
						necessary++;
						break outer;
					}
					l.add(a);
				}
				subSet.addAll(l);
			}
		}
		System.out.println(N - necessary);
		sc.close();
	}

}