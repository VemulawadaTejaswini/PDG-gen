import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[N+1];
		int[] b = new int[N+1];
		for( int i=1; i<=N; i++ ){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		} 
		int total = 0;
		for( int i=1; i<=N; i++ ){
			total += b[i];
		}
		int[] ans = new int[total+1];
		int count = 0;
		for( int i=1; i<=N; i++ ){
			for( int k=0; k<b[i]; k++ ){
				count++;
				ans[count] = a[i];
			}
		}
		Arrays.sort(ans);
		System.out.println(ans[K]);
	}
}
