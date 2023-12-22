import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int count = 0;
			int s = (int) Math.sqrt((double) n);
			for (int i = 1; i <= s; i++) {
				if (n % i == 0) {
					count += i;
					count += (n / i);
					if (n / i == 1)
						count -= (n / i);
					if (n / i == i)
						count -= (n / i);
					if (n / i == n)
						count -= n;
				}
			}
			if (n > count)
				System.out.println("deficient number");
			else if (n == count)
				System.out.println("perfect number");
			else
				System.out.println("abundant number");
		}

	}
}