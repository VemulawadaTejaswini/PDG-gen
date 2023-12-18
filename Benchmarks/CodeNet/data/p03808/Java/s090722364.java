import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int np = n*(n+1)/2;
		int k = 0;
		long[] a = new long[n];
		long[] d = new long[n];

		a[0] = sc.nextLong();
		long sum = a[0];
		for(int i=1; i<n; i++){
			a[i] = sc.nextLong();
			d[i-1] = a[i]-a[i-1];
			sum += a[i];
			k += sum/np;
			sum %= np;
		}
 		d[n] = a[0]-a[n-1];

		for(int i=0; i<n; i++){
			d[i] -= k;
			if( d[i] > 0 || d[i]%n != 0 ){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		return;
	}
}