
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int r = sc.nextInt();
			int s = sc.nextInt();
			int p = sc.nextInt();
			String t = sc.next();
			char[] tArray = t.toCharArray();
			Set<Integer> skipped = new HashSet<Integer>();

			long result = 0;
			for (int i = 0; i < n; i++) {
				if (i < k) {
					result += getPoint(r, s, p, tArray[i]);
				} else {
					if (tArray[i] != tArray[i - k]) {
						result += getPoint(r, s, p, tArray[i]);
					} else {
						if (skipped.contains(i - k)) {
							result += getPoint(r, s, p, tArray[i]);
						} else {
							skipped.add(i);
						}
					}
				}
			}

			System.out.println(result);
		}
	}

	private static int getPoint(int r, int s, int p, char enemy) {
		if (enemy == 'r') {
			return p;
		} else if (enemy == 's') {
			return r;
		} else {
			return s;
		}
	}
}
