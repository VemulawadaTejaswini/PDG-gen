import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			if (map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
			} else {
				map.put(A[i], 1);
			}
		}
		long ret = 0;
		// gusu
		if (N % 2 == 0) {
			for (int i = 1; i < N; i += 2) {
				if (map.get(i) != 2) {
					System.out.println(ret);
					return;
				}
			}
		} else {
			if (map.get(0) != 1) {
				System.out.println(ret);
				return;
			}
			for (int i = 2; i < N; i += 2) {
				if (map.get(i) != 2) {
					System.out.println(ret);
					return;
				}
			}
		}
		ret = (long) Math.pow(2, N / 2);
		ret = (long) (ret % (Math.pow(10, 9) + 7));
		System.out.println(ret);

	}
}