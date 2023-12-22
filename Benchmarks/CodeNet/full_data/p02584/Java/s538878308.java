import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		long X = stdIn.nextLong();
		long K = Math.abs(stdIn.nextLong());
		long D = stdIn.nextLong();
		
		long ans = X;
		
		long step = Math.min(K, X / D);
		K -= step;
		X -= step * D;
		
		if(K % 2 == 0) {
			ans = X;
		}else {
			ans = Math.abs(X - D);
		}
		
		System.out.println(ans);
	}
}