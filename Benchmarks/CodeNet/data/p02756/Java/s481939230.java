import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Q = sc.nextInt();
		StringBuffer buf = new StringBuffer(S);

		for (int i = 0; i < Q; i++) {
			if (sc.nextInt() == 1) {
				// 文字列Sを反転
				buf.reverse().toString();
			} else {
				if (sc.nextInt() == 1) {
					// Sの先頭に追加
					buf.insert(0, sc.next());
				} else {
					// Sの末尾に追加
					buf.append(sc.next());
				}
			}
		}

		System.out.println(buf.toString());
		sc.close();
	}
}
