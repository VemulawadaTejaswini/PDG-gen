import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++){
			BigInteger a = new BigInteger(scan.next());
			BigInteger b = new BigInteger(scan.next());
			System.out.println(a.add(b));
		}
	}

}