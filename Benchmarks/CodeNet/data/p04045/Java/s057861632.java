import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		solve(s);
		s.close();
	}

	public static void solve(Scanner s) {
		int n = s.nextInt();
		int k = s.nextInt();
		int[] d = new int[k];

		for (int i = 0; i < k; i++) {
			d[i] = s.nextInt();
		}

		Arrays.sort(d);

		for (int i = 0; i <= (n + "").length() - 1; i++) {

			boolean breakFlg = false;
			while (!breakFlg) {
				String nStr = n + "";
				int num = nStr.charAt(nStr.length() - i - 1) - 48;
				breakFlg = true;

				for (int j = 0; j < d.length; j++) {
					if (num == d[j]) {
						n += Math.pow(10, i);
						breakFlg = false;
						break;
					}
				}
			}
		}

		System.out.println(n);
	}
}
