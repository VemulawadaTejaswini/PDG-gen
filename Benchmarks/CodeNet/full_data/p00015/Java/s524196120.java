import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	for (int i = 0; i < N; i++) {
	    String a = scanner.next(), b = scanner.next();
	    BigInteger sum = new BigInteger(a), A = new BigInteger(b);
	    sum.add(A);

	    if ((sum.toString()).length() > 80) {
		System.out.println("overflow");
	    }
	    else {
		System.out.println(sum.toString());
	    }
	}
    }
}