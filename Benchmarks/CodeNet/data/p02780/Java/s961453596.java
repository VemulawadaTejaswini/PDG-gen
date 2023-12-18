import java.util.Scanner;

public class Main {

	private static int sum(int num) {
		int result = (1+num)*num/2;
		return result;
	}

	private static double kitai(int qi_n, int pi_n) {
		return qi_n / (double)pi_n;
	}

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int n = sca.nextInt();
	int k = sca.nextInt();
	int[] pi = new int[n];
	int[] qi = new int[n];
	double[] resu = new double[n];  // n番目までの期待値の累積和
	double result = 0.0;
	double loop = 0.0;
	for(int i = 0; i < n; i++) {
		pi[i] = sca.nextInt();
		qi[i] = sum(pi[i]);
	}
	for(int i = 0; i < n; i++) {
		if(i == 0) {
			resu[i] = kitai(qi[i], pi[i]);
			continue;
		}
		resu[i] = resu[i-1] + kitai(qi[i], pi[i]);
	}

	result = resu[k-1];
	for(int i = k; i < n; i++) {
		loop = resu[i] - resu[i-k];
		if(result < loop) {
			result = loop;
		}
	}
	System.out.println(result);

	// 後始末
	sca.close();
	}
}