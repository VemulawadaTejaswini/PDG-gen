import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int ans = 0;
		Map<Integer, Integer> L = new HashMap<Integer, Integer>();
		Map<Integer, Integer> R = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int l = i + A[i];
			int r = i - A[i];
			L.put(l, L.getOrDefault(l, 0) + 1);
			if (r > 0) {
				R.put(r, R.getOrDefault(r, 0) + 1);
			}
		}
		for (Entry<Integer, Integer> entry : L.entrySet()) {
			int l = entry.getKey();
			int lCount = entry.getValue();
			int rCount = R.getOrDefault(l, 0);
			ans += lCount * rCount;
		}

		System.out.println(ans);
	}

}
