import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int d = N / K;
		int d2 = N / (K + K / 2);
		int m = N % K;
		long count = 0;
		if (K/2 <= N) {
			if (K%2==1) {
				count = (long)d*(long)d*(long)d;
			} else {
				if (m==0) {
					count = (long)d*(long)d*(long)d*(long)2;
				} else {
					if (d2 > 0) {
						count = (long)d*(long)d*(long)d
								+ (long)(d+1)*(long)(d+1)*(long)(d+1);
					}
					else {
						count = 2;
					}

				}
			}
		}
		System.out.println(count);

	}

}