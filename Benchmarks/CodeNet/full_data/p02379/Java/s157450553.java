import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Lesson10A ２点 P1(x1, y1), P2(x2, y2) の距離を求めるプログラム
 *
 * @author Internship
 *
 */
public class Main{

	/**
	 * プログラムのエントリポイント
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// 1行目を取得
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			String strLine = insBR.readLine();

			// 分解
			String[] strAryLine1 = strLine.split(" ");

			// intにキャスト
			// 1つ目
			double dbX1 = Double.parseDouble(strAryLine1[0]);

			// 2つ目
			double dbY1 = Double.parseDouble(strAryLine1[1]);

			// 3つ目
			double dbX2 = Double.parseDouble(strAryLine1[2]);

			// 4つ目
			double dbY2 = Double.parseDouble(strAryLine1[3]);

			// 計算
			double dbAnswer = ((dbX2 - dbX1) * (dbX2 - dbX1)) + ((dbY2 - dbY1) * (dbY2 - dbY1));

			dbAnswer = Math.sqrt(dbAnswer);


			 //小数5桁まで
		    DecimalFormat insdf = new DecimalFormat("0.00000000");

			//結果を出力 double型は小数5桁まで表示
			System.out.println(insdf.format(dbAnswer));

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}