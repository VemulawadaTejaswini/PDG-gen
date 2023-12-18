import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		
		double a = 0;
		
		for(long i = 1; i <= N; i++) {
			int x = 1;
			if(i >= K) {
				a += 1.0 / (double)N;
			} else {
				long y = i * 2;
				while(y < K) {
					y *= 2;
					x++;
				}
				a += (1.0 / (double)N) * Math.pow(0.5, x);
			}
			
		}
		System.out.println(a);
		
	}
}
