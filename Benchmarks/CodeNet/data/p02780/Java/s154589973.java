import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];
		double[] e = new double[n];
		double[] s = new double[n+1];
		s[0] = 0;
		double ans = 0;
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
			e[i] = (double)(1+p[i])/2;
			s[i+1] = s[i]+e[i];
		}
		for(int i = 0; i <= n-k; i++) {
			double a = s[i+k]-s[i];
			if(ans < a)ans = a;
		}
		System.out.println(ans);
	}

}
