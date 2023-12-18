import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 複数行の標準入力
		ArrayList<String> strList = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String buf = in.nextLine();
			strList.add(buf);
		}
		in.close();

		// 入力データの分割
		int N = Integer.parseInt(strList.get(0));
		String S0 = strList.get(1);
		String T = strList.get(2);

		char[] tmpCharArray = S0.toCharArray();

		if (!S0.equals(T)) {

			int resultCnt = 0;
			while (true) {

				for (int i = 0; i < N; i++) {

					// 同じ文字がTに存在するか
					int tIdx = T.indexOf(tmpCharArray[i]);
					if (tIdx >= 0) {
						if (tIdx == i) {
							// Tと同じ位置ならそのまま
						} else {
							// 後ろの位置なら自分と同じ文字が後続に存在するか確認
							if ((new String(tmpCharArray)).indexOf(tmpCharArray[i], i + 1) > 0) {
								// 後ろに存在するなら1つ前の文字をコピーする
								tmpCharArray[i] = tmpCharArray[i - 1];
							}
						}
					} else {
						tmpCharArray[i] = tmpCharArray[i - 1];
					}
				}
				// 同じ文字が自分の後ろに存在するか
				// 必要なければ1つ前の文字をコピー

				resultCnt++;

				if (new String(tmpCharArray).equals(T)) {
					System.out.println(resultCnt);
					break;
				}

				if (resultCnt > 1000000) {
					System.out.println("-1");
					break;
				}
			}

		} else {
			System.out.println("0");
		}

	}
}
