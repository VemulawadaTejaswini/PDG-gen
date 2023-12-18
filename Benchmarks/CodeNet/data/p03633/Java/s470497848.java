
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		BigInteger[] T = new BigInteger[N];
		for(int i = 0; i < N; i++) {
			T[i] = BigInteger.valueOf(scan.nextLong());
		}
		// 最大公約数を求めてそこから最小公倍数を求める
		BigInteger gcd = new BigInteger("1");		// 最大公約数
		BigInteger lcm = new BigInteger("1");		// 最小公倍数
		
		for(int i = 1; i < N; i++) {
			gcd = T[i - 1].gcd(T[i]);
			lcm = T[i - 1].divide(gcd).multiply(T[i]);
			T[i] = lcm;
		}
		System.out.println(lcm);
		scan.close();
	}

}
