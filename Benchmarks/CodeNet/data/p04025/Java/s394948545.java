import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] num = new int[N];
		int a = 0;
		for( int i=0; i<N; i++ ){
			num[i] = sc.nextInt();
			a+=num[i];
		}
		if( a%N==0 ){
			a = a/N;
		}else{
			a = a/N+1;
		}
		int ans = 0;
		for( int i=0; i<N; i++ ){
			ans = ans + (num[i]-a)*(num[i]-a);
		}
		System.out.println(ans);
	}
}
