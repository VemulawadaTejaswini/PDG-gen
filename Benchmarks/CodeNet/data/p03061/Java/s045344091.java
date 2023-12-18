import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 0, maxGCD = 0, gcd = 0;

		Scanner scanner = new Scanner(System.in);
		
		N = scanner.nextInt();
		int[] value = new int[N];
		
		for (int i = 0; i < N; i++) {
			value[i] = scanner.nextInt();
		}
		
		scanner.close();

		
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				gcd = gcd(value[i], value[j]);
				maxGCD = Math.max(maxGCD, gcd);
			}
		}
		
		
		System.out.println(maxGCD);
		
		
	}
	// quot from : https://www.suzushin7.jp/entry/2016/11/04/calculate-greatest-common-devisor-in-java/
	 private static int gcd(int m, int n) {
	        if(m < n) return gcd(n, m);
	        if(n == 0) return m;
	        return gcd(n, m % n);
	    }
}
