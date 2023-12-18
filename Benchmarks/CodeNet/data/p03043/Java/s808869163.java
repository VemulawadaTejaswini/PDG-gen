import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(new Main().doWork(args));
	}

	public String doWork(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int k = reader.nextInt();

		reader.close();

		//		int rate = k / n;
		//		if(0 < (k % n)) {
		//			++rate;
		//		}

		BigDecimal ret = new BigDecimal(0);
		for (int i = 1; i <= n; ++i) {
//			int num = 1;
			int ct = 0;
			while (true) {
				if (k <= i * Math.pow(2, ct)) {
					break;
				}
				++ct;
			}

			BigDecimal wk = new BigDecimal(1);
			BigDecimal divisor = new BigDecimal(Math.pow(2, ct)).multiply(new BigDecimal(n));
			wk = wk.divide(divisor,200, RoundingMode.HALF_UP);
			ret = ret.add(wk);
//			return Double.toString(1.0d / Math.pow(2, ct));
		}

//		int num = 1;
//		int ct = 0;
//		while (true) {
//			if (k <= n * Math.pow(2, ct)) {
//				break;
//			}
//			++ct;
//		}

		return ret.toPlainString();
		//		return ch.substring(0, k - 1) + ch.substring(k - 1, k + 1 - 1).toLowerCase() + ch.substring(k + 1 - 1);
	}
}
