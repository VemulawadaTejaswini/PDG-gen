import java.util.*;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X[] = new long[N];
		HashMap<Long, Long> a = new HashMap<Long, Long>(), //番号が何個
				b = new HashMap<Long, Long>();//番号とその組み合わせ
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			if (!a.containsKey(X[i])) {
				a.put(X[i], (long)1);
			} else {
				a.put(X[i], a.get(X[i]) + 1);
			}
		}
		long sum = 0, ans = 0;
		for (long i : a.keySet()) {
			b.put(i, a.get(i) * (a.get(i) - 1) / 2);
			sum += a.get(i) * (a.get(i) - 1) / 2;
		}
		for (int i = 0;i<N;i++) {
			ans = sum - b.get(X[i]) + (a.get(X[i]) - 1) * (a.get(X[i]) - 2) / 2;
			System.out.println(ans);
		}
		//System.out.println();
		sc.close();

	}

}