import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 株式会社ワールドインテック 荒木広夢
 * @since 2020 03.09
 *
 */
class Main {
	private static final String numberRegex = "^[a-z]+ $";
//	private static ArgoPracitceContest ARGO_INSTANCE = new ArgoPracitceContest();

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		String strHkey = null;

		br = new BufferedReader(new InputStreamReader(System.in));
		strHkey = br.readLine();
		int i = 0;
		if (inputDataCheck(strHkey)) {

			//入力された文字列のバイト数分繰り返す
			while (i < strHkey.length()) {
				String hitachi = strHkey.substring(i, i + 2);

				if (!strHkey.equals(hitachi)) {
					break;
				} else {
					i += 2;
				}
			}
			if (i >= strHkey.length()) {
				System.out.println("Yes");

			} else {
				System.out.println("N o");
			}

		}
	}

	/**
	 * 未入力
	 * バイト数
	 * 文字列チェック
	 * @param hKye
	 * @return
	 */
	public static boolean inputDataCheck(final String hKye) {
		//未入力、バイト数チェック
		if (hKye == null || hKye.length() <= 0) {
			System.out.println("文字が入力されていません。半角英文字で入力してください。");
			return false;
		}

		//偶数でない hitachi文字列でない為処理を返す
		if (hKye.length() % 2 != 0) {
			return false;
		}

		//文字列チェック
		if (hKye.matches(numberRegex)) {
			return true;
		}
		return true;
	}
}
