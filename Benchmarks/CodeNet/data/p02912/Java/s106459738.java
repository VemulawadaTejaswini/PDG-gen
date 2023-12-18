import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		double[] d = new double[N];
		for (int i=0; i<N; i++){
			d[i] = sc.nextDouble();
		}
		for (int i=0; i<M; i++){
			Arrays.sort(d);
			d[N-1] = d[N-1] / 2;
		}
		long ans = 0;
		for (int i=0; i<N; i++){
			ans += Math.floor(d[i]);
		}
		System.out.println(ans);
	}
}