import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger a = BigInteger.valueOf(scan.nextInt());
		String bStr = scan.next();
		BigInteger b = new BigInteger(bStr);
		BigInteger x = BigInteger.valueOf(scan.nextInt());
		BigInteger sum = BigInteger.valueOf(0);
		BigInteger fb = b.divide(x).add(new BigInteger("1"));
		if(b.compareTo(new BigInteger("0")) == 0) {
			fb = new BigInteger("0");
		}
		BigInteger fa = a.add(new BigInteger("-1")).divide(x).add(new BigInteger("1"));
		if(a.compareTo(new BigInteger("0")) == 0) {
			fa = new BigInteger("0");
		}
		System.out.println(fb.add(fa.negate()));
		scan.close();
	}

}
