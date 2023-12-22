import java.math.BigInteger;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		BigInteger count = new BigInteger("1");
		int n = kb.nextInt();
		for (int i = 0; i < n; i++) {
			long j = kb.nextLong();
			if (j == 0) {
				// System.out.println(2);
				count = new BigInteger("0");
				break;
			}
			count = count.multiply(BigInteger.valueOf(j));
//			if (count.compareTo(new BigInteger("1000000000000000000")) == 1) {
//				System.out.println("k");
//				break;
//			}
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
