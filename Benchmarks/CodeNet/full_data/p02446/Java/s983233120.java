import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
				int N = Integer.parseInt(br.readLine());
				String input_str[] = br.readLine().split("\\s+");

				StringBuilder ans = new StringBuilder();
				ans.append(input_str[0]);

				String pre = input_str[0];

				for(int i = 1; i < input_str.length; i++){

					if(input_str[i].equals(pre))continue;

					ans.append(" ").append(input_str[i]);
					pre = input_str[i];
				}

				System.out.println(ans.toString());

			} catch (NumberFormatException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
}

class UTIL{

	//文字が半角数字か判定する関数
	public static boolean isNumber(String tmp_str){

		if(tmp_str == null || tmp_str.length() == 0){

			return false;
		}

		Pattern pattern = Pattern.compile("\\A[0-9]+\\z");
		Matcher matcher = pattern.matcher(tmp_str);
		return matcher.matches();
	}
}
