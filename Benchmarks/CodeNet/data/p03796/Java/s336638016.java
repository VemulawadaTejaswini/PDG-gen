
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		
		

		BigInteger ans = new BigInteger("1");
		for (BigInteger i = new BigInteger("1"); i.compareTo(n)<= 0; i = i.add(new BigInteger("1"))) {
			ans = ans.multiply(i);
		}
		System.out.println(ans.remainder(new BigInteger("1000000007")));
	}
}