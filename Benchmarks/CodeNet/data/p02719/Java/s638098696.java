import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		long k = scan.nextLong();

		if(k == 1 || n % k == 0) {
			n = 0;
		}else {
			for(;;) {
				if(n <= Math.abs(n - k)) {
					break;
				}else {
					n = Math.abs(n - k);
				}
			}
		}

		System.out.println(n);
	}
}
