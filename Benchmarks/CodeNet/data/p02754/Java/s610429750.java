import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		long n = kb.nextLong();
		long a = kb.nextLong();
		long b = kb.nextLong();
		long count = n / (a + b);
		if (a == 0)
			System.out.println(0);
		else if (0 < a && a <= n) {
			if (a + b >= n)
				System.out.println(a);
			else {
				if (n - count * (a + b) >= a && n - count * (a + b) != 0)
					System.out.println(count * a + a);
				else if (n - count * (a + b) < a && n - count * (a + b) != 0)
					System.out.println(count * a + n - count*(a + b));
				else if (n - count * (a + b) == 0)
					System.out.println(count * a);
			}
		} else {
			System.out.println(n);
		}
		kb.close();
	}

}
