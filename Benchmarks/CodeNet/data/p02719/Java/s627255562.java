import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger a = scanner.nextBigInteger();
		BigInteger b = scanner.nextBigInteger();
		
		BigInteger modValue = a.mod(b);
		
		BigInteger res1 = modValue.subtract(b).abs();
		
		if (res1.compareTo(modValue) == -1) {
			System.out.println(res1);
		} else {
			System.out.println(modValue);
		}
	}

}
