import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Q = sc.nextInt();

		boolean isReverse = false;

		for (int i = 0; i < Q; i++) {
			if (sc.nextInt() == 1) {
				// 文字列Sを反転するかどうかをフラグ管理
				isReverse = !isReverse;
			} else {
				if (sc.nextInt() == 1) {
					// 先頭に追加
					if (!isReverse) {
						S = sc.next() + S;
					} else {
						S = S + sc.next();
					}
				} else {
					// 末尾に追加
					if (!isReverse) {
						S = S + sc.next();
					} else {
						S = sc.next() + S;
					}
				}
			}
		}

		if (isReverse) {
			StringBuffer buf = new StringBuffer(S);
			S = buf.reverse().toString();
		}

		System.out.println(S);
		sc.close();
	}

}
