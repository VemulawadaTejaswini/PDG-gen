import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] count = new int[N+1];
		for( int i=0; i<M; i++ ){
			int a = sc.nextInt();
			int b = sc.nextInt();
			for( int j=a; j<=b; j++ ){
				count[j]++;
			}
		}
		int ans = 0;
		for( int i=1; i<=N; i++ ){
			if( count[i]==M ){
				ans++:
			}
		}
		System.out.println(ans);
	}
}
