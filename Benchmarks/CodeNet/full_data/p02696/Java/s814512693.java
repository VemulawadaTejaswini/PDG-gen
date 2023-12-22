
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();

		long max = Long.MIN_VALUE;
		long x = n;

		if(x/b==0||x%b == b-1) {
			System.out.println((a*x)/b - a *(x/b));
			sc.close();
			return;
		}

		if(x%b != b-1) {
			x = x - ((x%b)+1);
			System.out.println((a*x)/b - a *(x/b));
			sc.close();
			return;
		}

		sc.close();
	}


}