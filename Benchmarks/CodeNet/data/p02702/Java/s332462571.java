import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.length()<5) {
			System.out.println(0);
			return;
		}
		long[] sum = new long[200001];
		Arrays.fill(sum,0);
		for (int i = 4; i < s.length(); i++) {
			sum[i] = sum[i-1];
			for (int k = 0; k <= i-4; k++) {
				String sub = s.substring(k,i+1);
				BigInteger bigInteger = new BigInteger(sub);
				if (bigInteger.remainder(BigInteger.valueOf(2019l)) == BigInteger.ZERO) {
					sum[i]++;
				}
			}
		}
		System.out.println(sum[s.length()-1]);
	}

}
