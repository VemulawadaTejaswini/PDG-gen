import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();
		long X = 0;
		if( B-1<=N ){
			X = B-1;
		}else{
			X = N;
		}
		System.out.println( A*X/B - A*(X/B) );
	}
}