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
		
		BigInteger cnt = BigInteger.ZERO;
		BigInteger goal = null;
		for (;;) {
			// 距離D縮める
			abs = abs.subtract(d);
			cnt = cnt.add(BigInteger.ONE);			
			if (cnt.equals(k)) {
				goal = abs;
				break;
			}
			// 残り試行が奇数か偶数か
			BigInteger exa = k.subtract(cnt).mod(BigInteger.TWO);
			if (abs.compareTo(d) == 0) {
				goal = BigInteger.ZERO;
				break;
			}
			if (abs.compareTo(halfd) == 0) {
				goal = abs;
				break;
			}
			if (abs.compareTo(halfd) < 0) {
				if (exa.equals(BigInteger.ZERO)) {
					goal = abs;
					break;
				} else {
					goal = abs.subtract(d).abs();
					break;
				}
			} else if (abs.compareTo(halfd) > 0 && abs.compareTo(d) < 0) {
				if (exa.equals(BigInteger.ZERO)) {
					goal = abs;
					break;
				} else {
					goal = abs.subtract(d).abs();
					break;
				}
			}
		}
		System.out.println(goal);
		
	}
}
