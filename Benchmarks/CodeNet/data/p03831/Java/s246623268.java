import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		
		long ans = 0;
		for (int i = 1; i < n; i++) {
			long d = x[i] - x[i-1];
			if( a * d < b) {
				ans += a * d;
			}else{
				ans += b;
			};
		}
		System.out.println(ans);
	}
	
    
}

