import java.util.Scanner;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger n = new BigInteger("0");
		BigInteger m = new BigInteger("0");
		BigInteger x = new BigInteger("0");
		n = input.nextBigInteger();
		m = input.nextBigInteger();
		x = input.nextBigInteger();
		BigInteger sum = new BigInteger("0");
		sum = m.divide(x).subtract(n.divide(x));
		if(n.mod(x).equals(0))sum = sum.add(BigInteger.valueOf(1));
		System.out.println(sum);
	}
}