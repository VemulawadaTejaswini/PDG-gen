import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] a = new long[N];
		for( int i=0; i<N; i++ ){
			a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		long ans = 0;
		System.out.println(ans%1000000007L);
	}
}
