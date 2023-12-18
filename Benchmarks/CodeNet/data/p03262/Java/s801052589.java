
import java.util.*;

public class Main {
	
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		int[] x = new int[N];
		
		for(int i=0; i<N; i++) {
			x[i] = scanner.nextInt();
		}
		
		int D = Math.abs(x[0] - X);
		
		for(int i=1; i<N; i++) {
			D = gcd(D, Math.abs(x[i] - X));
		}
		
		System.out.println(D);
		

	}

}
