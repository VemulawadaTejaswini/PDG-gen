import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String X = sc.next();

		BigDecimal x = new BigDecimal(X);
		BigDecimal one = new BigDecimal(0.01);
		BigDecimal val = new BigDecimal(100);
		BigDecimal add = BigDecimal.ZERO;
		BigDecimal ans = BigDecimal.ZERO;

		while (val.compareTo(x) < 0) {

			add = val.multiply(one);
			val = val.add(add);
			ans = ans.add(new BigDecimal(1));
		}

		// 出力
		System.out.println(ans.toString());
	}
}