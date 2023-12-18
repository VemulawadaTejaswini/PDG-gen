import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		int n = scanner.nextInt();
		int sr = scanner.nextInt();
		int sc = scanner.nextInt();
		String s = scanner.next();
		String t = scanner.next();
		int[] tsuml = new int[n + 1];
		int[] tsumr = new int[n + 1];
		int[] tsumu = new int[n + 1];
		int[] tsumd = new int[n + 1];
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'L') {
				tsuml[i + 1] = tsuml[i] + 1;
			} else if (s.charAt(i) == 'R') {
				tsumr[i + 1] = tsumr[i] + 1;
			} else if (s.charAt(i) == 'U') {
				tsumu[i + 1] = tsumu[i] + 1;
			} else {
				tsumd[i + 1] = tsumd[i] + 1;
			}
		}
		int[] asuml = new int[n + 1];
		int[] asumr = new int[n + 1];
		int[] asumu = new int[n + 1];
		int[] asumd = new int[n + 1];
		for (int i = 0; i < n; i++) {
			if (t.charAt(i) == 'L') {
				asuml[i + 1] = asuml[i] + 1;
			} else if (t.charAt(i) == 'R') {
				asumr[i + 1] = asumr[i] + 1;
			} else if (t.charAt(i) == 'U') {
				asumu[i + 1] = asumu[i] + 1;
			} else {
				asumd[i + 1] = asumd[i] + 1;
			}
		}
		boolean end = false;
		for (int i = 1; i <= n; i++) {
			if (tsumr[i] - asuml[i - 1] > w - sc || tsuml[i] - asumr[i - 1] >= sc || tsumu[i] - asumd[i - 1] >= sr || tsumd[i] - asumu[i - 1] > h - sr) {
				end = true;
				break;
			}
		}
		if (!end) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}