
import java.util.*;
import java.math.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		process: {
			int num = sc.nextInt();
			String[] input = new String[num];
			for (int j = 0; j < num; j++) {
				input[j] = sc.next();
			}
			for (int k = 0; k < num; k++) {
				if (input[k].equals("0")) {
					System.out.println(0);
					break process;
				}
			}
			for (int k = 0; k < num; k++) {
				if (input[k].length() >= 18) {
					System.out.println(-1);
					break process;
				}

			}
			BigInteger[] bigArray = new BigInteger[num];
			for (int i = 0; i < num; i++) {
				bigArray[i] = new BigInteger(input[i]);
			}
			BigInteger ans = new BigInteger(input[0]);
			for (int i = 1; i < num; i++) {
				ans = ans.multiply(bigArray[i]);
			}

			if (ans.compareTo(new BigInteger("1000000000000000000")) == 1) {
				System.out.println(-1);
			} else {
				System.out.println(ans);
			}
			sc.close();
		}
	}// main
}
// class
