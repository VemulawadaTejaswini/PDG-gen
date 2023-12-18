import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long p = sc.nextLong();
		if (n == 1) {
			System.out.println(p);
			return;
		}
		long res = 1;
		for (int i = 2; i * i <= p; i++) {
			long count = 0;
			while (p % i == 0) {
				p /= i;
				count++;
				if (count == n) {
					res *= i;
					count = 0;
				}
			}
		}
		System.out.println(res);
	}
}
