import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] x = new double[n];
		double[] y = new double[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}
		double ans = 0;
		double mul = 2;
		for(int i = 1; i < n; i++) {
			mul *= i;
		}
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				ans += mul * Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
			}
		}
		double fac = 1;
		for(int i = 1; i < n + 1; i++) {
			fac *= i;
		}
		ans /= fac;
		System.out.println(ans);
	}
 
}