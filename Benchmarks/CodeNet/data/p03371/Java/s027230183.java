import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String[] hyozyun = br.readLine().split(" ");
			int A =Integer.parseInt(hyozyun[0]);
			int B =Integer.parseInt(hyozyun[1]);
			int C =Integer.parseInt(hyozyun[2]);
			int X =Integer.parseInt(hyozyun[3]);
			int Y =Integer.parseInt(hyozyun[4]);
			
			// 合計金額を設定
			int sum = 0;
			// Cを２枚買ったほうが安い場合
			if (A + B < 2 * C) {
				sum = A * X + B * Y;
			} else {
			// それぞれ買ったほうが安い場合
				// 枚数少ないほうをすべて買って、プラス足りない分購入
				if (X > Y) {
					sum = C * 2 * Y + (X - Y) * A;
				} else {
					sum = C * 2 * X + (Y - X) * B;
				}
			}
			// XとYの枚数が多いほうの分だけ、Cを買った場合の値段
			int compare = 0;
			if (X > Y) {
				compare = X * C * 2;
			} else {
				compare = Y * C * 2;
			}
			// 上記の計算結果のほうが安い場合はそちらを採用
			if (sum > compare) {
				sum = compare;
			}
			
			System.out.println(sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}