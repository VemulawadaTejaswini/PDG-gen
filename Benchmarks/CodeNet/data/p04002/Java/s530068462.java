import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int V;

	public static void main(String[] args) {
		long H = sc.nextInt();
		long W = sc.nextInt();
		int N = sc.nextInt();
		HashSet<Long> set = new HashSet<>();
		HashSet<Long> dot = new HashSet<>();
		for (int i = 0; i < N; ++i) {
			int A = Integer.parseInt(sc.next()) - 1;
			int B = Integer.parseInt(sc.next()) - 1;
			dot.add(((long) A << 32) | B);
			for (int dr = -2; dr <= 0; ++dr) {
				long r = A + dr;
				if (r < 0 || r + 2 >= H) continue;
				for (int dc = -2; dc <= 0; ++dc) {
					long c = B + dc;
					if (c < 0 || c + 2 >= W) continue;
					set.add((r << 32) | c);
				}
			}
		}
		long[] ans = new long[10];
		for (long pos : set) {
			int count = 0;
			for (int i = 0; i < 3; ++i) {
				for (int j = 0; j < 3; ++j) {
					if (dot.contains(pos + i * (1L << 32) + j)) ++count;
				}
			}
			ans[count]++;
		}
		long sum = 0;
		for (int i = 0; i < ans.length; ++i) {
			sum += ans[i];
		}
		System.out.println((H - 2) * (W - 2) - sum + ans[0]);
		for (int i = 1; i <= 9; ++i) {
			System.out.println(ans[i]);
		}
	}

}
