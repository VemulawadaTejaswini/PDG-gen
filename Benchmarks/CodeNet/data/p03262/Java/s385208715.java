import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int x[] = new int[N];
		for(int i=0;i<N;i++)x[i]=sc.nextInt();
		sc.close();
		
		int ans = Math.abs(X-x[0]);
		for(int i=0;i<N-1;i++) {
			ans = gcd(ans,x[i+1]-x[i]);
		}
		
		System.out.println(ans);
		
	}
	
	static int gcd(int x, int y) {
		return y==0? x:gcd(y, x%y);
	}
}
