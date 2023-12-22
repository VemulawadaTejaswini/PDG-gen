import java.util.*;
public class Main {

	public static long mod = 1000000007L ;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];
		for ( int i=0; i<n; i++ ) {
			a[i] = sc.nextLong();
		}

		long g = 0L;
		for ( int i=0; i<n; i++ ) {
		for ( int j=i+1; j<n; j++ ) {
			long add1 = (a[i]*a[j])%mod ;
			g = (g+add1)%mod ;
		}
		}
		System.out.println(g);
	}
}