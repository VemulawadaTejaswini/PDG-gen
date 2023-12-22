
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
 static final int ADD      = 1;
 static final int MINUS    = 2;
 static final int MULTIPLY = 3;
 static final int DIVIDE   = 4;

 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int count = in.nextInt();
	BigInteger n = BigInteger.ZERO, d = BigInteger.ONE;
	for (int i = 0; i < count; i++) {
	 int op = in.nextInt();
	 BigInteger num = in.nextBigInteger();
	 switch (op) {
	 case MINUS:
		num = num.negate();
	 case ADD:
		n = n.add(d.multiply(num));
		break;
	 case MULTIPLY:
		n = n.multiply(num);
		break;
	 case DIVIDE:
		d = d.multiply(num);
		break;
	 }
	 System.out.println(n + "/" + d + "= {" + n.divide(d));
	 BigInteger gcd = n.gcd(d);
	 System.out.println(gcd);
	 if (!BigInteger.ONE.equals(gcd)) {
		n = n.divide(gcd);
		d = d.divide(gcd);
	 }
	 System.out.println(n + "/" + d + "= " + n.divide(d));
	}
	System.out.println(n.divide(d));
 }
}