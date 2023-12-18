import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		long[] x = new long[N];
		long[] y = new long[N];
		long[] z = new long[N];
		for(int i=0;i<N;i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
			z[i] = sc.nextLong();
		}

		long[][] sign = {{1,1,1},{1,1,-1},{1,-1,1},{1,-1,-1},{-1,1,1},{-1,1,-1},{-1,-1,1},{-1,-1,-1}};
		long max = 0;
		long[] sum = new long[N];
		for(int i=0;i<8;i++) {
			for(int j=0;j<N;j++) {
				sum[j] = sign[i][0] * x[j] + sign[i][1] * y[j] + sign[i][2] * z[j];
			}
			Arrays.sort(sum);
			long s = 0;
			for(int j=0;j<M;j++) {
				s += Math.abs(sum[j]);
			}
			if(s > max) {
				max = s;
			}
		}
		System.out.println(max);
	}

}
