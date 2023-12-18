import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//結果の値
		int ResultTime = 0;

		// 入力値を取得
		Scanner sc = new Scanner(System.in);
		BigDecimal a = new BigDecimal((double) (sc.nextInt()));
		BigDecimal b = new BigDecimal((double) (sc.nextInt()));
		BigDecimal c = new BigDecimal((double) (sc.nextInt()));
		BigDecimal d = new BigDecimal((double) (sc.nextInt()));
		BigDecimal e = new BigDecimal((double) (sc.nextInt()));

		// 入力値の十の位を繰り上げ
		int round_a = (int) (a.setScale(-1, BigDecimal.ROUND_UP).doubleValue());
		int round_b = (int) (b.setScale(-1, BigDecimal.ROUND_UP).doubleValue());
		int round_c = (int) (c.setScale(-1, BigDecimal.ROUND_UP).doubleValue());
		int round_d = (int) (d.setScale(-1, BigDecimal.ROUND_UP).doubleValue());
		int round_e = (int) (e.setScale(-1, BigDecimal.ROUND_UP).doubleValue());

		// 繰り上げ値との差分で一番大きいものを判定
		int[] data = {round_a - a.intValue(), round_b - b.intValue(),
				round_c - c.intValue(), round_d - d.intValue(),
				round_e - e.intValue()};
		int BigDifference = data[0];
		int MenuNo = 0;
		for (int i = 0; i < data.length; i++) {
			int value = data[i];
			if (value > BigDifference) {
				BigDifference = value;
				MenuNo = i;
			}
		}
		
		//時間の差分が大きいものは最初にもっていく
		if(MenuNo ==0) {
			ResultTime = a.intValue()+round_b+round_c+round_d+round_e;
			System.out.println(ResultTime);
		}
		if(MenuNo ==1) {
			ResultTime = round_a+b.intValue()+round_c+round_d+round_e;
			System.out.println(ResultTime);
		}
		if(MenuNo ==2) {
			ResultTime = round_a+round_b+c.intValue()+round_d+round_e;
			System.out.println(ResultTime);
		}
		if(MenuNo ==3) {
			ResultTime = round_a+round_b+round_c+d.intValue()+round_e;
			System.out.println(ResultTime);
		}
		if(MenuNo ==4) {
			ResultTime = round_a+round_b+round_c+round_d+e.intValue();
			System.out.println(ResultTime);
		}
		
		//クローズ
		sc.close();
		
	}
}
