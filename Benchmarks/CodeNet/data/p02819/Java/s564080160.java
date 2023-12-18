import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while (true) {
			if (IsPrime(x)) {
				System.out.println(x);
				return;
			}
			x++;
		}
	}

	static boolean IsPrime(int n) {
		if (n < 2)
			return false;
		else if (n == 2)
			return true;
		else if (n % 2 == 0)
			return false;
		double sqrtNum = Math.sqrt(n);
		for (int i = 3; i <= sqrtNum; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}