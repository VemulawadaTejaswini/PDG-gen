import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();
		
		X = Math.abs(X);
		long move = Math.min(K, X/D);
		X -= move*D;
		if((K-move)%2==1) {
			X = X-D;
		}
		System.out.println(Math.abs(X));

		sc.close();
	}
}
