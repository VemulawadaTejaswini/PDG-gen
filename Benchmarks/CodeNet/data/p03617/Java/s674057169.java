import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int q = sc.nextInt();
		int h = sc.nextInt();
		int s = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int min = Math.min(4 * q, h * 2);
		min = Math.min(min, s);
		long sum = 0;
		if (min * 2 > d) {
			if (n >= 2) {
				sum = (long) n / 2 * d;
			}
			sum += (long) ((n % 2) * min);
		} else {
			sum = (long) min * n;
		}
		System.out.println(sum);
	}
}
