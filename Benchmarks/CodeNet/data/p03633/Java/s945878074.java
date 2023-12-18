import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] T = new long[N];
		for( int i=0; i<N; i++ ){
			T[i] = sc.nextLong();
		}
		Arrays.sort(T);
		long ans = T[N-1];
		for( int i=0; i<N; i++ ){
			for( int j=1; j<=T[i]; j++ ){
				if( (ans*j)%T[i]==0 ){
					ans = ans*j;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
