
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		double T = sc.nextDouble();
		double A = sc.nextDouble();
		long ans = 1;
		double H = sc.nextDouble();
		double tmp = T - H * 0.006;
		double tem = Math.abs(A - tmp);
		for(long i = 2; i < N + 1; i++) {
			H = sc.nextDouble();
			tmp = T - H * 0.006;
			if(tem > Math.abs(A - tmp)) {
				tem = Math.abs(A - tmp);
				ans = i;
			}
		}
		System.out.println(ans);

	}

}
