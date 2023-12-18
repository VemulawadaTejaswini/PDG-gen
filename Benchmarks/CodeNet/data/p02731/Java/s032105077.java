import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int l = sca.nextInt();

		int i = l/3;
		int j = l/3;
		int k = l/3;
		double max = 1.0;
		//int a = 1;
		//int b = 1;
		//int c = 1;
		int a_b_c = 1;
		double a_d = 1.0;
		double b_d = 1.0;
		double c_d = 1.0;
		double a_b_c_d = 1.0;

		for(int m = 0; m <= 100; m++) {
			for(int n = 0; n <= 100; n++) {
				for(int o = 0; o <= 100; o++) {
					a_b_c = i*j*k;
					a_d = (double)0.01*m;
					b_d = (double)0.01*n;
					c_d = (double)0.01*o;
					a_b_c_d = a_d*b_d*c_d;
					if((i + a_d + j + b_d + k + c_d) != (double) l) {
						break;
					}
					else {
						if(max < a_b_c + a_b_c_d) {
							max = a_b_c + a_b_c_d;
						}
					}
				}
			}
		}
		BigDecimal bd = new BigDecimal(max);

		System.out.println(bd.setScale(8, RoundingMode.HALF_UP));

		// 後始末
		sca.close();
	}
}