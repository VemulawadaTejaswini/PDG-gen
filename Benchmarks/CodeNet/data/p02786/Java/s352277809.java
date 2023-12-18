import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long H = sc.nextLong();
		int count = 0;
		if( H>1 ){

		for( int i=0; i<40; i++ ){
			H = H/2;
			count++;
			if( H==1 ){
				break;
			}
		}

		}
		long ans = 1;
		long a = 1;
		for( int i=0; i<count; i++ ){
			a = a*2;
			ans += a;		
		}
		System.out.println(ans);
	}
}
