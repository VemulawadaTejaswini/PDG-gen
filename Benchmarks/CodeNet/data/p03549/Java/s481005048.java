import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
		double M = sc.nextDouble();
		double ans = (1900d * M + 100d * (N - M)) * Math.pow(2, M);
		
		System.out.println((int)ans);
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}