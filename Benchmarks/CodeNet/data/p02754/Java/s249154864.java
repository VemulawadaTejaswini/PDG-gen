import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		long n = kb.nextLong();
		long a = kb.nextLong();
		long b = kb.nextLong();
		long count = n;
		long k = 0;
		if (a == 0)
			System.out.println(0);
		else if (0 < a && a <= n) {
			if (a + b >= n)
				System.out.println(a);
			else {
				while (count > a) {
					k += a;
					count = count - a - b;
				}
				if (count>0) System.out.println(k + count);
				else System.out.println(k);

			}
		} else {
			System.out.println(n);
		}
		kb.close();
	}

}
