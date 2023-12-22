import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean[] iseven = new boolean[100];
		Arrays.fill(iseven, true);
		int countmax = 0;
		while (in.hasNext()) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			countmax = Math.max(countmax, Math.max(a, b));
			if (a + b < 0) {
				int i = 2;
				boolean OK = true;
				while (OK && i <= countmax) {
					OK &= iseven[i++];
				}
				System.out.println(OK ? "OK" : "NG");
				Arrays.fill(iseven, true);
				countmax = 0;
			} else {
				iseven[a] = !iseven[a];
				iseven[b] = !iseven[b];
			}
		}
	}
}