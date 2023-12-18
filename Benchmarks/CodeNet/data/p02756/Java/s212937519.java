import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Q = sc.nextInt();

		for (int i = 0; i < Q; i++) {
			if (sc.nextInt() == 1) {
				// 文字列Sを反転
				StringBuffer buf = new StringBuffer(S);
				S = buf.reverse().toString();
			} else {
				if (sc.nextInt() == 1) {
					// Sの先頭に追加
					S = sc.next() + S;
				} else {
					// Sの末尾に追加
					S = S + sc.next();
				}
			}
		}

		System.out.println(S);
		sc.close();
	}

}
