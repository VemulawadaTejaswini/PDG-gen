import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double[] nums = new double[6];

		while(sc.hasNext()) {
				for(int i = 0; i < nums.length; i++) {
					nums[i] = sc.nextDouble();
				}

			simuEqu(nums);
		}

		sc.close();
	}

	private static void simuEqu(double[] nums) {
		double a = nums[0]; /* x + */ double b = nums[1]; /* y = */ double c = nums[2];
		double d = nums[3]; /* x + */ double e = nums[4]; /* y = */ double f = nums[5];

		int lcm_y = lcm((int)b, (int)e);

		int mul_a = lcm_y / (int)b;
		int mul_d = lcm_y / (int)e;

		double x = ( mul_a * c - mul_d * f ) / ( mul_a * a - mul_d * d );

		double y = (  c - a * x ) / b;

		System.out.printf("%.3f %.3f\n",x ,y);

	}

	private static int lcm(int i, int j) {
		int lcm = i * j / gcd(Math.abs(i), Math.abs(j));
		return lcm;
	}

	private static int gcd(int x, int y) {
		int x_tmp = 0;

		do {
			x_tmp = x;

			x = y;
			y = x_tmp % y;
		}while(y > 0);

		int gcd = x;

		return gcd;
	}

}

