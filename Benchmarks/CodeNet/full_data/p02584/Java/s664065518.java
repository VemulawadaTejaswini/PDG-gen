import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		
		long tmp1 = Math.abs(x) / d;
		long tmp2 = k - tmp1;
		
		if(x > k*d) {
			System.out.println(Math.abs(x - k*d));
			return;
		}else if(x < -(k*d)) {
			System.out.println(Math.abs(x + k*d));
			return;
		}
		
		if(x >= 0) {
			x = x - tmp1 * d;
			if(tmp2 % 2 == 0) {
				System.out.println(Math.abs(x));
				return;
			}else {
				System.out.println(Math.abs(x-d));
				return;
			}
		}else {
			x = x + tmp1 * d;
			if(tmp2 % 2 == 0) {
				System.out.println(Math.abs(x));
				return;
			}else {
				System.out.println(Math.abs(x+d));
				return;
			}
		}
		
		

		

	}

}
