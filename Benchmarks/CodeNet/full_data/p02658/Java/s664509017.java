import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger ans = BigInteger.ONE;
		
		BigInteger border = BigInteger.ONE;
		for (int i = 0; i < 18; i++) {
			border = border.multiply(BigInteger.valueOf(10));
		}
		
		for (int i = 0; i < n; i++) {
			ans = ans.multiply(new BigInteger(sc.next()));
		}
		
		if (ans.compareTo(border) > 0) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
}
