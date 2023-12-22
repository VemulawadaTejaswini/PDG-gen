import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long a, b, n;
		Scanner scan = new Scanner(System.in);

		a = scan.nextLong();
		b = scan.nextLong();
		n = scan.nextLong();

		long num = 0;
		long max = 0;
		for(long i = 1; i <= n; i++) {
			num = (long)(Math.floor(a*i/b) - a * Math.floor(i/b));

			if(max < num) {
				max = num;
			}
		}

		System.out.println(max);
	}
}
