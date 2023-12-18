import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		double p = 0;

		if(N < K) {

			for(int i=1;i<=N;i++) {
				p += Math.pow(2, -1*((int)(log2(K/i) + 1)));
			}

			p /= N;
		}else {
			for(int i=1;i<K;i++) {
				p += Math.pow(2, -1*((int)(log2(K/i) + 1)));
			}
			p /= N;

			p += (double)(N-K+1)/(double)N;
		}
		System.out.println(p);
	}

	public static double log2(double a) {
		return Math.log(a)/Math.log(2);
	}
}