import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			BigInteger n = sc.nextBigInteger().add(sc.nextBigInteger());
			System.out.println(n.toString().length() > 80 ? "overflow" : n);
		}

	}

}