import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] count = new int[N+1];
		for( int i=0; i<K; i++ ){
			int D = sc.nextInt();
			for( int k=0; k<D; k++ ){
				int a = sc.nextInt();
				count[a]++;
			}
		}
		int ans = 0;
		for( int i=1; i<=N; i++ ){
			if( count[i]==0 ){
				ans++;
			}
		}
		System.out.println(ans);
	}
}