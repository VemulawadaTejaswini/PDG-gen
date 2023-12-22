import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		BigInteger n = new BigInteger(sc.next());
		BigInteger sqrt = n.sqrt();
		int ans = 0;
		int divCnt = 0;
		for (BigInteger i = BigInteger.TWO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
			// 素因数分解
			if (n.mod(i).equals(BigInteger.ZERO)) {
				n = n.divide(i);
				ans++;
			}
			if (divCnt == 0 && i.compareTo(sqrt) > 0) {
				// 割れないまま平方根越え→素数
				ans++;
				break;
			}
		}

		System.out.println(ans);
	}
}
