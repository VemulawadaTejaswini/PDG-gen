import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		long sum = 1;
		if((int)Math.abs(N - M) == 0 || (int)Math.abs(N - M) == 1) {
			for(long i = 1; i <= N; i++) {
				sum = (sum * i) % 1000000007;
			}
			for(long i = 1; i <= M; i++) {
				sum = (sum * i) % 1000000007;
			}
			if((int)Math.abs(N - M) == 0) {
				sum = (sum * 2) % 1000000007;
			}
		} else {
			sum = 0;
		}
		System.out.println(sum);
		scan.close();
	}

}
