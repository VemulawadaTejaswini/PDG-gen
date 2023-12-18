import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] v = new double[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		double ans = v[0];
		for (int  i = 1; i < n; i++) {
			ans = (v[i] + ans) / 2; 
		}
		System.out.println(ans);
	}
}