import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] c = new int[3];

	static int solve() {
		int ret = 0;
		int min = Math.min(c[0], Math.min(c[1], c[2]));
		for (int i = 0; i <= Math.min(3, min); ++i) {
			int count = (c[0] - i) / 3 + (c[1] - i) / 3 + (c[2] - i) / 3 + i;
			ret = Math.max(ret, count);
		}
		return ret;
	}

	public static void main(String[] args) throws Exception {
		while (true) {
			Arrays.fill(c, 0);
			c[0] += sc.nextInt();
			c[1] += sc.nextInt();
			c[2] += sc.nextInt();
			c[0] += sc.nextInt();
			c[1] += sc.nextInt();
			c[2] += sc.nextInt();
			if (c[0] + c[1] + c[2] == 0) break;
			System.out.println(solve());
		}
	}

}