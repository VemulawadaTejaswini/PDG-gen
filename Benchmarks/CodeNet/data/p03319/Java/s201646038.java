import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int N,K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		//Optional<Integer> min = list.stream().min((a, b) -> a.compareTo(b));
		Integer min = Collections.min(list);
		System.out.println("min "+min);

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < N; i ++) {
			if (list.get(i) == min) {
				int k = i - K > 0 ? i - K : 0;
				System.out.println("k " + k);
				for (int a = k; a < k+K; a++) {
					int x = ((Math.abs(0 - a) % (K-1)) == 0) ? Math.abs(0 - a) / (K-1) : (Math.abs(0-a) / (K-1)) + 1;
					int y = ((Math.abs(list.size() - a) % K) == 0) ? Math.abs(list.size() - a) / K : (Math.abs(list.size() - a) /K) +1;
					System.out.println("x "+x);
					System.out.println("y "+y);
					ans = Math.min(ans, x+y);
				}
			}
		}
		System.out.println(ans);
	}
}
