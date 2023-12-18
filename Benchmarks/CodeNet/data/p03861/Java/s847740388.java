
import java.math.BigInteger;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger x = sc.nextBigInteger();
		
		BigInteger cnt = new BigInteger("0");
		for (BigInteger i = a; i.compareTo(b) <= 0; i = i.add(new BigInteger("1"))) {
			if (i.remainder(x).equals(new BigInteger("0"))) cnt = cnt.add(new BigInteger("1"));
		}
		
		System.out.println(cnt);
	}
}