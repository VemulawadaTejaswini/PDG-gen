import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		long x[] = new long[N];
		for(int i=0;i<N;i++)x[i]=sc.nextLong();
		sc.close();
		
		long ans = Math.abs(X-x[0]);
		for(int i=0;i<N-1;i++) {
			int dist = (int)Math.abs(x[i+1]-x[i]);
			ans = gcd(ans,dist);
		}
		
		System.out.println(ans);
		
	}
	
	static long gcd(long x, long y) {
		return y==0? x:gcd(y, x%y);
	}
}
