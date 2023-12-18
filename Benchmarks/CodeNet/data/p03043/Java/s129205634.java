import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S1 = sc.next();
		String S2 = sc.next();
		
		long N = Long.parseLong(S1);
		long K = Long.parseLong(S2);
		
		double res = 0;
		for (int i = 1; i < K && i <= N; i++) {
			double t = Math.ceil((Math.log(K)/Math.log(2))-Math.log(i)/Math.log(2));
			res += (double)Math.pow((0.5), t)/N;
		}
		for (int i = (int) K; i <= N; i++) {
			res += (double)1/N;
		}
		System.out.println(res);
		
	}

}
