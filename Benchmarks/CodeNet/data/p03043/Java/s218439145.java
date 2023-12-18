import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double N = stdIn.nextDouble();
		double K = stdIn.nextDouble();
		double ans = 0;
		for(double i = 1; i <= N; i++) {
			if(i >= K) {
				ans += 1/N;
			}
			else {
				double b = 1/N;
				for(double j = i; j <= K; j = j*2) {
					b = b/2;
				}
				ans += b;
			}
		}
		System.out.println(ans);

	}

}