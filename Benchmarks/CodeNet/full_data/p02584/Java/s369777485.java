import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");

		//コード
		//    	Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		BigInteger X = BigInteger.valueOf(sc.nextLong());
		BigInteger K = BigInteger.valueOf(sc.nextLong());
		BigInteger D = BigInteger.valueOf(sc.nextLong());

		BigInteger p = K.multiply(D);
		BigInteger A = X.abs();
		if(A.compareTo(p)>=0) {
			BigInteger d = A.subtract(p);
			System.out.println(d);
		} else {
			BigInteger Q = A.mod(D);
			BigInteger Q2 = D.subtract(Q);
			BigInteger P = A.divide(D);
			BigInteger rest = K.subtract(P);
			if(rest.mod(BigInteger.valueOf(2))==BigInteger.valueOf(0)) {
				System.out.println(Q);
			} else {
				System.out.println(Q2);
			}

		}

	}
}
