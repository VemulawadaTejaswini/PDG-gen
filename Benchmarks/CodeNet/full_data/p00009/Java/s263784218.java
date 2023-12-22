
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			System.out.println(num_prime(n));
		}
		in.close();
	}

	static int num_prime(int n) {
		int num = 0;
		if (2 <= n)
			num++;
		for (int i = 3; i <= n; i = i + 2) {
			if (is_prime(i))
				num++;
		}
		return num;
	}

	static Boolean is_prime(int n) {
		if (n <= 1)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i = i + 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}