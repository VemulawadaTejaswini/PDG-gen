import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger ans = BigInteger.ONE;
		BigInteger q = BigInteger.ONE;
		
		BigInteger modnum = BigInteger.ONE;
		for (int i = 0; i < 9; i++) {
			modnum = modnum.multiply(BigInteger.TEN);
		}
		modnum = modnum.add(BigInteger.valueOf(7));
		
		for (int i = 0; i < n; i++) {
			if (i < n-2) {
				ans = ans.multiply(BigInteger.TEN);
			}
			q = q.multiply(BigInteger.valueOf(i+1));
			ans = ans.multiply(q).mod(modnum);
		}
		if (n == 1) {
			System.out.println(0);
		} else if (n == 2) {
			System.out.println(2);
		} else {
			System.out.println(ans);
		}
	}
}
