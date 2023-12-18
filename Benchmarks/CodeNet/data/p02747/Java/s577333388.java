import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 株式会社ワールドインテック 荒木広夢
 * @since 2020 03.09
 *
 */
public class Main {
	private static final String regex  = "^[a-z]+$";
	private static final String numberRegex = "^[0-9]+$";
	public static void main(String[] args) {
		BufferedReader br = null;
		String strHkey = null;
		boolean isCheckhi = false;
		try {
			do {
				br = new BufferedReader(new InputStreamReader(System.in));
				strHkey = br.readLine();

				Pattern p = Pattern.compile(numberRegex);
				Matcher m = p.matcher(strHkey);

				if (m.find()) {
					break;
				}

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
		if (hiKye.contains("hi") && hiKye.matches(regex)) {
			System.out.println("Yes");
			return true;

		} else {
			System.out.println("No");
			return false;

		}
	}
}
