import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger n = sc.nextBigInteger();
		BigInteger k = sc.nextBigInteger();
		// NとKの余り
		BigInteger ans = n.remainder(k);

		// NとKの余りと余りとKの差を大小比較
		System.out.println(ans.min(ans.subtract(k).abs()));
	}
}