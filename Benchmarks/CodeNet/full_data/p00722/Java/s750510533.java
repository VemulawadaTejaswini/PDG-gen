import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i = 2; i * i <= n; i++)
			if (n % i == 0) return false;
			
		return true;
	}
	
	void run() {
		int a, d, n;
		while (true) {
			a = sc.nextInt();
			d = sc.nextInt();
			n = sc.nextInt();
			if (d == 0) break;
			int count = 0;
			int i = 0;
			while (a+i*d <= 1000000) {
				if (isPrime(a+i*d))
					count++;
				if (count == n)
					break;
				i++;
			}
			out.println(a+i*d);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}