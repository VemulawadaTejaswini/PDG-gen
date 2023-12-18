import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();

		if(n < k) {
			if(n > k - n) {
				n = k - n;
			}
		}else {
			n %= k;
		}

		n = (n > Math.abs(n - k))? Math.abs(n - k) : n;

		System.out.println(n);

		sc.close();
	}
}
