import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] v = new double[N];
		double ans = 0;
		double a = 0;
		double b = 0;

		for (int i = 0; i < N; i++) {
			v[i] = sc.nextInt();
		}
		
		Arrays.sort(v);
		
		a = ( v[0] + v[1] ) / 2;
		b = a;
		if(N > 2) {
			for(int j = 2; j < N; j++) {
				b = (a + v[j]) / 2;
			}
		}
		
		
		System.out.println(b);

	}

}