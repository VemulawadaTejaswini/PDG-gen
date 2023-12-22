import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; ++i) {		
			BigInteger n = sc.nextBigInteger();
			BigInteger m = sc.nextBigInteger();
			BigInteger MAX = new BigInteger("10000000000000000000000000000000000000000000000000000000000000000000000000000000");
			if (n.add(m).compareTo(MAX) < 0) {
				System.out.println(n.add(m));
			} else {
				System.out.println("overflow");
			}
		}
	}
}