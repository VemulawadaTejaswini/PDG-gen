
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double ans = 0.0;
		for(int i = 1; i < N + 1; i++) {
			int tmp = i;
			double per = 1.0 / N;
			while(tmp < K) {
				tmp *= 2;
				per /= 2.0;
			}
			ans += per;
		}
		System.out.println(ans);
	}

}
