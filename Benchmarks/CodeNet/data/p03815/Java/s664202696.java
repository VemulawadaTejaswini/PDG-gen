
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger x = new BigInteger(sc.next());
		boolean flag = true;
		BigInteger ans = new BigInteger("0");
		int y = x.mod(new BigInteger("11")).intValue();
		if(0 < y && y <= 6) {
			ans = x.divide(new BigInteger("11")).multiply(new BigInteger("2")).add(new BigInteger("1"));
		} else if(6 < y) {
			ans = x.divide(new BigInteger("11")).multiply(new BigInteger("2")).add(new BigInteger("2"));
		}
		System.out.println(ans.toString());

	}

}
