import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger a = BigInteger.valueOf(in.nextLong());
		BigInteger b = BigInteger.valueOf(in.nextLong());
		long C = in.nextLong();
		long red = C / 2;
		long blue = (C / 2 + C % 2);
		System.out.println(a.multiply(b).multiply(BigInteger.valueOf(Math.abs(blue - red))));
		in.close();
	}
}