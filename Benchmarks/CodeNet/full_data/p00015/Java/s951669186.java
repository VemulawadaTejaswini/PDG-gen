import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dataset = scanner.nextInt();
		for(int i=0; i<dataset; i++){
			BigInteger first = scanner.nextBigInteger();
			BigInteger second = scanner.nextBigInteger();
			System.out.println(first.add(second));
		}
	}
}