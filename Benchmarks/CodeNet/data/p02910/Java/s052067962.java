import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args){
		var scan = new Scanner(System.in);

		var S = scan.next();

		var ans = solve(S);

		System.out.println(ans);

	}

	/**
	 *  踏みやすい判定メソッド
	 * @param s
	 * @return
	 *
	 *
	 */
	public static String solve(String s)
	{
		// 文字列の長さ取得
		var sLen = s.length();

		// 偶数テーブル
		final var Etable = new ArrayList<String>(Arrays.asList("L", "U", "D"));
		// 奇数テーブル
		final var Otable = new ArrayList<String>(Arrays.asList("R", "U", "D"));


		for(var i = 0;i < sLen;i++)
		{
			// 文字を一文字ずつ抽出する
			var tmp = s.charAt(i);

			// 偶数判定
			// 数字の先頭を1番目にするため、1を足す
			if(0 == ((i + 1) & 1))
			{
				if(!Etable.contains(String.valueOf(tmp)))
				{
					return "No";
				}
			}
			// 奇数判定
			else
			{
				if(!Otable.contains(String.valueOf(tmp)))
				{
					return "No";
				}
			}
		}
		return "Yes";
	}
}
