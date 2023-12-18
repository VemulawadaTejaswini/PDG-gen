import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		ArrayList<Long> right = new ArrayList<>();
		ArrayList<Long> left = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			long x = sc.nextLong();
			if (x>0) {
				right.add(x);
			} else if(x==0) {
				K--;
			} else {
				left.add(-x);
			}
		}
		right.add(0L);
		left.add(0L);

		Collections.sort(right);
		Collections.sort(left);

		long ans = Long.MAX_VALUE;

		//正からi点、負からK-i点取る
		for (int i = 0; i < right.size(); i++) {
			int j = K - i;
			if (j >= 0 && j < left.size()) {
				long min = Math.min(right.get(i), left.get(K-i));
				long max = Math.max(right.get(i), left.get(K-i));

				ans = Math.min(ans , min*2 + max);
			}
		}
		//負からi点、正からK-i点取る
		for (int i = 0; i < left.size(); i++) {
			int j = K - i;
			if (j >= 0 && j < left.size()) {
				long min = Math.min(left.get(i), right.get(K-i));
				long max = Math.max(left.get(i), right.get(K-i));

				ans = Math.min(ans, min*2 + max);
			}
		}
		System.out.println(ans);
	}
}
