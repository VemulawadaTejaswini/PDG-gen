import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		long ans = 0;
		String value = "";
		BigInteger teisuu = BigInteger.valueOf(2019);
		BigInteger baisuu = BigInteger.ONE;
		for(long i=1; i<10000; i++) {
			baisuu = teisuu.multiply(BigInteger.valueOf(i));
			value = String.valueOf(baisuu);
//			System.out.println(value.length());

			int index = 0;
			while(index < s.length()) {
				index = s.indexOf(value, index);
				if(index == -1)
					break;

				ans ++;
				index++;
			}
		}

		System.out.println(ans);
	}
}
