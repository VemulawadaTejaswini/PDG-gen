import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			long n = sc.nextLong();
			int k = sc.nextInt();
			long r = sc.nextLong();
			long s = sc.nextLong();
			long p = sc.nextLong();
			// 文字列の入力
			String t = sc.next();
			List<Integer> hands = new ArrayList<Integer>();
			long score = 0;
			for (int i = 1; i <= n; i++) {
				char t1 = t.charAt(i - 1);
				if (t1 == 'r') {
					if (i <= k || hands.get(i - k - 1) != 2) {
						score = score + p;
						hands.add(2);
					} else {
						hands.add(0);
					}
				} else if (t1 == 's') {
					if (i <= k || hands.get(i - k - 1) != 0) {
						score = score + r;
						hands.add(0);
					} else {
						hands.add(1);
					}
				} else if (t1 == 'p') {
					if (i <= k || hands.get(i - k - 1) != 1) {
						score = score + s;
						hands.add(1);
					} else {
						hands.add(2);
					}
				}
			}
			System.out.println(score);
		}
	}
}