import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		BigInteger ba = BigInteger.valueOf(a);
		//ba = ba.multiply(BigInteger.valueOf(a));
		BigInteger bb = BigInteger.valueOf(b);
		//bb = bb.multiply(BigInteger.valueOf(b));
		BigInteger bc = BigInteger.valueOf(c);
		//bc = bc.multiply(BigInteger.valueOf(c));
		String ans = "Yes";
		BigInteger d =  BigInteger.valueOf(4).multiply(ba).	multiply(bb);
		BigInteger e = bc.subtract(ba).subtract(bb);
		if (d.compareTo(e.multiply(e)) >= 0) {
			ans = "No";
		}
		sc.close();
		System.out.println(ans);
	}
}
