import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] nums = new int[6];

		while(sc.hasNext()) {
				for(int i = 0; i < nums.length; i++) {
					nums[i] = sc.nextInt();
				}

			simuEqu(nums);
		}

		sc.close();
	}

	private static void simuEqu(int[] nums) {
		int a = nums[0]; /* x + */ int b = nums[1]; /* y = */ int c = nums[2];
		int d = nums[3]; /* x + */ int e = nums[4]; /* y = */ int f = nums[5];

		int lcm_y = lcm(b, e);

		int mul_a = lcm_y / b;
		int mul_d = lcm_y / e;

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

