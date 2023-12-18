import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		BigDecimal n = sc.nextBigDecimal();
		// スペース区切りの整数の入力
		BigDecimal k = sc.nextBigDecimal();

		// NとKの余りと余りとKの差を大小比較
		System.out.println((n.remainder(k).min(n.remainder(k)).subtract(k).abs()));
	}
}