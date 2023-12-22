import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//キーボード入力メソッド
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		double Pi = Math.PI;
		double menseki_x = r * r * Pi;
		double syuu_y = 2 * r * Pi;

		//fの小数点以下の桁数を指定(5桁)
				BigDecimal menseki = new BigDecimal(menseki_x);
				menseki = menseki.setScale(5, BigDecimal.ROUND_HALF_UP);
				BigDecimal syuu = new BigDecimal(syuu_y);
				syuu = syuu.setScale(5, BigDecimal.ROUND_HALF_UP);

		//出力
		System.out.println(menseki +" "+ syuu);

	}

}

