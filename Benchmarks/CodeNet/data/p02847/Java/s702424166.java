import java.util.Scanner;

public class Main {

	private static int keta(long n) {
		int result = 0;
		while(n > 0) {
			n = n / 10;
			result++;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long num_a = scan.nextLong();
		long num_b = scan.nextLong();
		long num_x = scan.nextLong();
		long[] num_i = new long[10];
		long result;

		if((num_x - num_b * 1) / num_a == 0) {
			System.out.println(0);
		}
		for (int i = 1; i < 11; i++) {
			num_i[i-1] = num_x - num_b * i;
			if(keta(num_i[i-1] / num_a) == i) {
				System.out.println(num_i[i-1] / num_a);
			}
		}

		if((num_x - num_b * 10) / num_a > 1000000000) {
			System.out.println(1000000000);
		}
	}
}