import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		BigInteger bordersum = BigInteger.ZERO;
		int tmpborder = 0;
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if (i == 0) {
				tmpborder = tmp;
				continue;
			}
			if (tmp < tmpborder) {
				bordersum = bordersum.add(BigInteger.valueOf(tmpborder).subtract(BigInteger.valueOf(tmp)));
			} else {
				tmpborder = tmp;
			}
		}
		System.out.println(bordersum);
	}
}
