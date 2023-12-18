import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int[] point = new int[N+1];
		for( int i=0; i<Q; i++ ){
			point[sc.nextInt()]++;
		}
		for( int i=1; i<=N; i++ ){
			System.out.println( point[i]>Q-K ? "Yes" : "No" );
		}
	}
}
