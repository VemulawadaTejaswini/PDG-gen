import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N, K;
		N = sc.nextInt();
		K = sc.nextInt();
		sc.close();
		double ans = 0;
		for (int i = 1; i <= N; i++) {
			double tmp = 1.0/N;
			int  now = i;
			while (now < K) {
				now *= 2;
				tmp /= 2;
			}
			ans += tmp;

		}

		System.out.println(ans);


	}


}