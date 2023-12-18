import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long n = N - 1;
		int m = 0;
		for(long i = 1; i <= N; i++) {
			for(long j = 1; j <= N / i; j++) {
				if(i > N / i) {
					m = 1;
					break;
				}
				if(i * j == N && (i + j) - 2 <= n) {
					n = i + j - 2;
				}
			}
			if(m == 1) {
				break;
			}
		}
		System.out.println(n);
	}

}
