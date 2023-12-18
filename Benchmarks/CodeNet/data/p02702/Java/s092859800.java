import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.length()<5) {
			System.out.println(0);
			return;
		}
		long[][] sum = new long[2][200001];
//		Arrays.fill(sum,0l);
		long count = 0;
		int j = 1;
		for (int i = 4; i < s.length(); i++) {
			for (int k = 0; k <= i-4; k++) {
				if (sum[1-j][k] == 0) {
					sum[1-j][k] = Long.valueOf(s.substring(i-4,i));
				}
				long temp = sum[1-j][k] * 10 + (s.charAt(i)-'0');
				if (temp % 2019 ==0) {
					count++;
				}
				sum[j][k] = temp%2019;
				j=1-j;
			}
		}
		System.out.println(count);
	}

}
