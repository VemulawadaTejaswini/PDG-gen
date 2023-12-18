import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();	//K <= N
		int a = N - K;
		int b = K - 1;
		int c = 0;
		if( a%b!=0 ){
			c = 1;
		}
		System.out.println(1+a/b+c);
	}
}
