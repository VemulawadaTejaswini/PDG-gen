import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Deque<String> q = new ArrayDeque<>();
		q.add(s);
		int n = Integer.valueOf(sc.nextLine());
		boolean isReverse = false;
		for (int i = 0; i < n; i++) {
			String[] in = sc.nextLine().split(" ");
			if ("1".equals(in[0])) {
				// que反転
				isReverse = !isReverse;
			} else {
				// 向きを示す物が必要
				if ("1".equals(in[1]) == isReverse) {
					// 後ろ
					q.addLast(in[2]);
				} else {
					// 前
					q.addFirst(in[2]);
				}
			}
		}
		System.out.println(String.join("", q));
	}
}
