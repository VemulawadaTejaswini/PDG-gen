import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger b = sc.nextBigInteger();
		System.out.println(b.pow(3).toString());
	}
}