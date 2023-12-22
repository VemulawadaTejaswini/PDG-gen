import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	for (int i = 0; i < N; i++) {
	    String a = scanner.nextString(), b = scanner.nextString();
	    BigInteger sum = BigInteger(a) + BigInteger(b);
	    String n_80 = "1";
	    for (int j = 0; j < 79; j++) {
		n_80 += "0";
	    }
	    if (sum >= BigInteger(n_80)) {
		System.out.println("overflow");
	    }
	    else {
		System.out.println(sum.toString());
	    }
	}
    }
}