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
	double result = 0.0;
	double loop = 0.0;
	for(int i = 0; i < n; i++) {
		pi[i] = sca.nextInt();
		qi[i] = sum(pi[i]);
	}
	for(int i = 0; i < n-k+1; i++) {
		loop = 0.0;
		for(int j = i; j < i+k; j++) {
			loop += kitai(qi[j], pi[j]);
		}
		if(result < loop) {
			result = loop;
		}
	}
	System.out.println(result);

	// 後始末
	sca.close();
	}
}