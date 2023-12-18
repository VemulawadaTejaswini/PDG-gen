import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		sc.close();

		BigDecimal high = BigDecimal.valueOf(H);
		BigDecimal wide = BigDecimal.valueOf(W);
		BigDecimal check = BigDecimal.valueOf(2);

		BigDecimal mass = high.multiply(wide);
		BigDecimal result = mass.remainder(check);
		BigDecimal tmpAns = mass.divide(check);

		if(result.intValue() == 0) {
			long ans = tmpAns.longValue();
			System.out.println(ans);
		}else {
			long ans = tmpAns.longValue() + 1;
			System.out.println(ans);
		}
	}

}