import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// A, B, Kを取得
		Scanner scan = new Scanner(System.in);
		String aStr = scan.next();
		String bStr = scan.next();
		String kStr = scan.next();
		scan.close();

		// a, b, kを数値に変換
		long a = Long.parseLong(aStr);
		long b = Long.parseLong(bStr);
		long k = Long.parseLong(kStr);

		// k回繰り返す
		for (int i = 0; i < k; i++) {

			// もし高橋君がクッキーを 1 枚以上持っているなら、高橋君のクッキーを 1 枚食べる。
			if (a >= 1) {
				a--;

				// そうでなく、もし青木君がクッキーを 1 枚以上持っているなら、青木君のクッキーを 1 枚食べる。
			} else if (b >= 1) {
				b--;

				// 高橋君も青木君もクッキーを持っていないなら、何もしない。
			} else {
				break;
			}
		}

		// 高橋君と青木君が最終的に持っているクッキーの枚数を出力
		System.out.println(a + " " + b);

	}

}
