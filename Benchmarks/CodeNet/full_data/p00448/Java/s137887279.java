import java.util.BitSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int R = sc.nextInt();
			int C = sc.nextInt();
			if (R == 0) break;
			sc.nextLine();
			BitSet[] bs = new BitSet[R];
			for (int i = 0; i < R; ++i) {
				bs[i] = new BitSet(C);
				String line = sc.nextLine();
				for (int j = 0; j < C; ++j) {
					bs[i].set(j, line.charAt(2 * j) == '1');
				}
			}
			int ans = 0;
			for (int i = 0; i < (1 << R) - 1; ++i) {
				int sum = 0;
				for (int j = 0; j < C; ++j) {
					int count = 0;
					for (int k = 0; k < R; ++k) {
						if (bs[k].get(j) ^ (i & (1 << k)) > 0) ++count;
					}
					sum += Math.max(count, R - count);
				}
				ans = Math.max(ans, sum);
			}
			System.out.println(ans);
		}
	}
}