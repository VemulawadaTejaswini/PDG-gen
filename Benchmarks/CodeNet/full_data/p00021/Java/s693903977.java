
import java.util.Scanner;

/**
 * AOJ id=0021
 * Parallelism
 * @author scache
 *
 */
public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int a=0;a<n;a++){
			long[] x =new long[2];
			long[] y =new long[2];
			for(int i=0;i<4;i++){
				int sign = i%2==0 ? 1:-1;
				x[i/2] += sc.nextDouble() *sign * 1e7;
				y[i/2] += sc.nextDouble() *sign * 1e7;
			}
			solve(x, y);
		}
	}

	public void solve(long[] x, long[] y) {
		System.out.println(x[0]*y[1]==y[0]*x[1] ? "YES" : "NO");
	}

}