import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();
		sc.close();

		long answer = 0L;
		boolean isPlus = true;
		if(X == 0L){
			if(K % 2L == 0L){
				answer = 0L;
			} else {
				answer = D;
			}
		} else {
			if(X < 0L){
				isPlus = false;
				X *= -1L;
			}
			if(K * D < X){
				answer = X - (K * D);
			} else {
				long quotient = X / D;
				long mod = X % D;
				K -= quotient;
				if(K % 2L == 0L){
					answer = mod;
				} else {
					answer = Math.abs(mod - D);
				}
			}
		}
		System.out.println(answer);
	}

}