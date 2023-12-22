import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] as = new int[n];
		BigInteger exact = BigInteger.valueOf(1000);
		BigInteger holds = BigInteger.ZERO;
		for (int i = 0; i < n; i++) {
			as[i] = sc.nextInt();
			if (i == 0) continue;
			if (as[i] > as[i-1]) {
				// 今 > 前	→前の値段で買って今売る
				holds = exact.divide(BigInteger.valueOf(as[i-1]));
				exact = exact.subtract(holds.multiply(BigInteger.valueOf(as[i-1]))).add(holds.multiply(BigInteger.valueOf(as[i])));
			}
		}
		System.out.println(exact);
	}
}
