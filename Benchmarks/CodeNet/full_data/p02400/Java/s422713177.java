import java.math.BigDecimal;
import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		double p = Math.PI;
		BigDecimal s = new BigDecimal(2*p*r);
		s = s.setScale(6,BigDecimal.ROUND_HALF_UP);
		BigDecimal m = new BigDecimal(r*p*r);
		m = m.setScale(6,BigDecimal.ROUND_HALF_UP);
		System.out.printf("%.6f" + " " + "%.6f",s, m);
	}
}