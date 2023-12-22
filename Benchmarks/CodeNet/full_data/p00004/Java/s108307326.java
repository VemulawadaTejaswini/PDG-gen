import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		int[] con = new int[6];
		while (sc.hasNext()) {
			for (int i = 0; i < 6; i++) {
				con[i] = sc.nextInt();
			}
			double x = 0;
			double y = 0;
			x = (con[2] * con[4] - con[1] * con[5]) / (con[0] * con[4] - con[1] * con[3]);
			y = (con[2] * con[3] - con[0] * con[5]) / (con[1] * con[3] - con[0] * con[4]);
			BigDecimal xx = new BigDecimal(x);
			BigDecimal yy = new BigDecimal(y);
			xx = xx.setScale(3, BigDecimal.ROUND_HALF_UP);
			yy = yy.setScale(3, BigDecimal.ROUND_HALF_UP);

			System.out.println(xx + " " + yy);
		}

	}

}