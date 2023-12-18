
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		sc.close();
		int[] modNums = new int[2019];
		count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				continue;
			}
			String strI = s.substring(i);
			BigInteger numI = new BigInteger(strI);
			BigInteger index = numI.remainder(BigInteger.valueOf(2019));
			modNums[index.intValue()]++;
		}

		count += modNums[0];
		for (int num : modNums) {
			count += (num * (num - 1) / 2);
		}
		System.out.println(count);
	}

}
