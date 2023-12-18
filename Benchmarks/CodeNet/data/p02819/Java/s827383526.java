import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		long ca = 1;
		long aa = 0;
		boolean fr = true;
		while (fr) {
			for (int i = 2; i < 10; i++) {
				if (i != a) {
					if (a + ca % i != 0) {
						aa++;
					}
				}
			}
			if (aa == 9) {
				break;
			}
			ca++;
		}
		System.out.println((ca + a));
	}
}