import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nStr = sc.next();
		long n = Long.parseLong(nStr);
		//int n = sc.nextInt();
		List<Long> multi = new ArrayList<Long>();

		//素因数分解
		long x = n;
		while (x % 2 == 0) {
			multi.add((long) 2);
			x /= 2;
		}
		for (long i = 3; i <= x;) {
			if (x % i == 0) {
				multi.add(i);
				x /= i;
			} else {
				i += 2;
			}
		}

		long nj = 1;
		for (int i = 0; i < multi.size() - 1; i++) {
			nj *= multi.get(i);
		}
		long ni = multi.get(multi.size() - 1);

		System.out.println((ni - 1) + (nj - 1));
	}
}