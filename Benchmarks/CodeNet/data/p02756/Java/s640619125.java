
import java.util.*;

// とりあえず入出力例１～３が通るようなロジック
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String result = sc.next();
		int n = Integer.parseInt(sc.next());

		// 入力しながらクエリにこたえていこう
		int reverse = 1;
		for (int i = 0; i < n; i++) {

			if (Integer.parseInt(sc.next()) == 1) {
				reverse *= -1;
			} else {
				int kind = Integer.parseInt(sc.next());
				if ((kind == 1 && reverse == 1) || (kind == 2 && reverse == -1)) {
					result = sc.next() + result;
				} else {
					result = result + sc.next();
				}
			}
		}

		// 最後に今が逆行状態なら結果反転
		if (reverse == -1) {
			String str = result;
			result = "";
			for (int i = 0; i < str.length(); i++) {
				result += str.charAt(str.length() - 1 - i);
			}
		}

		System.out.println(result);

	}

}