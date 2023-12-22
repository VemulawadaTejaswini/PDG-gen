import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		BigInteger x = new BigInteger(sc.next());
		BigInteger k = new BigInteger(sc.next());
		BigInteger d = new BigInteger(sc.next());
		BigInteger abs = x.abs();
		BigInteger halfd = d.abs().divide(BigInteger.TWO);
		BigInteger goal = null;
		
		BigInteger div = x.divide(d);
		if (div.compareTo(k) > 0) {
			goal = abs.subtract(d.multiply(k));
			System.out.println(goal);
		} else if (div.compareTo(k) == 0) {
			goal = BigInteger.ZERO;
			System.out.println(goal);
		} else {
				// 距離縮める
				abs = abs.subtract(d.multiply(div));
				// 残り試行が奇数か偶数か
				BigInteger cnt = k.subtract(div);
				BigInteger exa = k.subtract(cnt).mod(BigInteger.TWO);
				if (abs.compareTo(halfd) == 0) {
					goal = abs;
				}
				if (abs.compareTo(halfd) < 0) {
					if (exa.equals(BigInteger.ZERO)) {
						goal = abs;
					} else {
						goal = abs.subtract(d).abs();
					}
				} else if (abs.compareTo(halfd) > 0 && abs.compareTo(d) < 0) {
					if (exa.equals(BigInteger.ZERO)) {
						goal = abs;
					} else {
						goal = abs.subtract(d).abs();
					}
				}
			System.out.println(goal);
		}
	}
}
