/**
 * @author 株式会社ワールドインテック 荒木広夢
 * @since 2020 03.09
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader br = null;
		String strHkey = null;
		boolean isCheckhi = false;
		try {
			do {
				br = new BufferedReader(new InputStreamReader(System.in));
				strHkey = br.readLine();

				if (inputCheck(strHkey)) {
					//hi文字列が含まれているかどうか
					if (hiContains(strHkey)) {
						isCheckhi = true;

					}
				} else {
					isCheckhi = false;
				}

			} while (!isCheckhi);

		} catch (IOException | NumberFormatException e) {
			System.out.println("不正な値が入力されたました。入力をやり直してください。");
			System.out.println(e.getMessage());
			System.exit(1);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.exit(1);
			}
		}
	}

	/**
	 * 未入力
	 * バイト数
	 * @param hKye
	 * @return
	 */
	public static boolean inputCheck(String hKye) {
		if (hKye != null) {
			//未入力チェック
			if (hKye.length() >= 1 && hKye.length() <= 10) {
				return true;
			}
		} else {
			return false;
		}
		return true;
	}

	/**
	 * 文字列「hi」が含まれているか
	 * @param hiKye
	 */
	public static boolean hiContains(String hiKye) {
		if (hiKye.contains("hi")) {
			System.out.println("Yes");
			return true;

		} else {
			System.out.println("No");
			return false;

		}
	}
}
