
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long D = sc.nextLong();
		long N = sc.nextLong();
		long ans = 0;
		if ((long)Math.pow(100, D) * N % (long)Math.pow(100, D) == 0 ) {
			ans = (long)Math.pow(100, D) * N;
		}else {
			ans = (long)Math.pow(100, D) * (N + 1);
		}

		System.out.println(ans);

	}
}
