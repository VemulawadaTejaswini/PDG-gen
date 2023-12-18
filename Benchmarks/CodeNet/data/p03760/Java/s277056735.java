
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		String s = "";
		int countA = 0;
		int countB = 0;
		for (int i = 0; i < a.length() + b.length(); i++) {
			if (i % 2 == 0) {
				s = s.concat(a.substring(countA, countA + 1));
				countA++;
			} else {
				s = s.concat(b.substring(countB, countB + 1));
				countB++;
			}
		}
		
		System.out.println(s);
	}
}