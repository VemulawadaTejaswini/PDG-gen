import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long X = sc.nextLong();
		long[] a = new long[N+1];
		long[] dis = new long[N+1];
		for( int i=1; i<=N; i++ ){
			a[i] = sc.nextLong();
		}
		a[0] = X;
		Arrays.sort(a);
		for( int i=1; i<=N; i++ ){
			dis[i] = a[i]-a[i-1];
		}
		Arrays.sort(dis);
		System.out.println(dis[0]);
	}
}
