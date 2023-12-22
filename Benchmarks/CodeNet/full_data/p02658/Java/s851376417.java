import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		BigInteger count = new BigInteger("1");
		int n = kb.nextInt();
		boolean t = true;
		for (int i = 0; i < n; i++) {
			long j = kb.nextLong();
			if (j != 0) {
				if (t == true) {
					count = count.multiply(BigInteger.valueOf(j));
					if (count.compareTo(new BigInteger("1000000000000000000")) == 1) {
						// System.out.println("k");
						t = false;
//				break;
					}
				}
			} else {
				count = new BigInteger("0");
				break;
			}
		}
		int res = count.compareTo(new BigInteger("1000000000000000000"));
		if (res == 1) {
			// System.out.println(res);
			System.out.println(-1);
		} else {
			System.out.println(count);
		}

		kb.close();
	}

}
