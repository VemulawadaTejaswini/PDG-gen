import java.util.*;
import java.lang.*;
public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] count = new int[N+1];
		for( int i=2; i<=N; i++ ){
			int a = sc.nextInt();
			count[a]++;
		}
		for( int i=1; i<=N; i++ ){
			System.out.println(count[i]);
		}
	}
}