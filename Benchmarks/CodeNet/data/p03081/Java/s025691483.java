
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int Q = in.nextInt();

		String s = in.next();

		char[] cs = s.toCharArray();
		int[] count = new int[N];
		Arrays.fill(count, 1);

		for (int i = 0; i < Q; i++) {
			String t = in.next();
			String d = in.next();

			char tc = t.charAt(0);
			char dc = d.charAt(0);
			for (int j = 0; j < N; j++) {
				if (cs[j] == tc) {
					if (dc == 'L') {
						if (j > 0 && count[j] > 0) {
							count[j - 1] += count[j];
						}
						count[j] = 0;
					} else if (dc == 'R') {
						if (j < N - 1 && count[j] > 0) {
							count[j + 1] += count[j];
						}
						count[j] = 0;
					}
				}
			}
		}

		int ans = Arrays.stream(count).sum();
		System.out.println(ans);

	}
}
