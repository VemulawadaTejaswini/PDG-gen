import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int X = sc.nextInt();
		int x[] = new int[N];
		for(int i = 0; i < N; i ++) {
			x[i] = sc.nextInt();
		}
		int minNum = 0;
		for(int i = 0; i < N; i ++) {
			if(i == 0) {
				minNum = Math.abs(X - x[i]);
			} else {
				minNum = Math.min(minNum, Math.abs(X - x[i]));
			}
		}
		
		boolean flag = true;
		
		int answer = Integer.MAX_VALUE;
		
		for(int i = 0; i < N; i ++) {
			answer = Math.min(gcd(Math.abs(X - x[i]), minNum), answer);
		}
		System.out.println(answer);
	}
	
	private static int gcd(int m, int n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}
