import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String base = in.next();

		// AかBCの連続だけを取り出す
		Matcher m = Pattern.compile("A(A|BC)*BC").matcher(base);

		//@fmt:off
		int endX = -1;	int newX = 1;	int cntA = 0;	int cnt = 0;
		//@fmt:on

		while ( m.find() ) {
			String targ = m.group();					// ターゲットをひとつ取り出す
			targ = targ.replace("BC", "X");

			do {
				newX = targ.indexOf("X", endX + 1);	// 上で最初のXを見つけて
				cntA += newX - endX - 1;				// これまでのAの総数（＝このXの交換可能回数）を計算
				cnt += cntA;								// 全体の交換可能回数に加算して
				endX = newX;								// 次へ
			} while ( endX < targ.length() );

			endX = -1;
			newX = 1;
			cntA = 0;
		}

		System.out.println(cnt);
		in.close();
	}
}