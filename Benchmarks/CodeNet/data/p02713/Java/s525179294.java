import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		long[][] gcd = new long[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				gcd[i][j] = GCD(i+1, j+1);
			}
		}
		long sum = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					sum += GCD(i+1, gcd[j][k]);
				}
			}
		}
		System.out.println(sum);
	}
	static private long GCD(long X, long Y) {
		while(Y != 0){
			long temp = X % Y;
			X = Y;
			Y = temp;
		}
		return X;
	}
}