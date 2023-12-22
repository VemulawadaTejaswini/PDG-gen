import java.util.Scanner;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger judge = new BigInteger("(long) Math.pow(10, 18)");
		BigInteger ans = BigInteger.ONE;
		for(int i = 0; i < n; i++) {
			ans = ans.multiply(BigInteger.valueOf(sc.nextLong()));
		}
		if(ans.compareTo(judge)==1) {
			System.out.println(-1);
			return;
		}
		System.out.println(ans);
	}
}