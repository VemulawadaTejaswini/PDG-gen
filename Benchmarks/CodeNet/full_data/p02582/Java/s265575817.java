import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		x=Math.abs(x);
			for (long i = 0; i <= k; i++) {
				if (x <= 0) {
					x += d;
				} else {
					x -= d;
				}
			}
	System.out.println(x);
		}

	}