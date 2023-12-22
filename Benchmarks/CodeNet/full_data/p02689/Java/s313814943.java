import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] H = new int[N+1];
		for( int i=1; i<=N; i++ ){
			H[i] = sc.nextInt();
		}
		int[] good = new int[N+1];
		for( int i=0; i<M; i++ ){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if( H[a]<H[b] ){
				good[a]++;
			}
			if( H[b]<H[a] ){
				good[b]++;
			}
			if( H[a]==H[b] ){
				good[b]++;
			}
		}
		int ans = 0;
		for( int i=1; i<=N; i++ ){
			if( good[i]==0 ){
				ans++;
			}
		}
		System.out.println(ans);
	}
}