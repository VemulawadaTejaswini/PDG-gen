import java.math.BigInteger;
import java.util.Scanner;

public class Mani {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			BigInteger b = sc.nextBigInteger();
			System.out.println(b.toString(4));
		}
	}
}