import java.util.*;
import java.lang.*;
public class Main{

	public static long gcd(long x,long y){
		return y>0 ? gcd(y,x%y) : x;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long max = gcd(A,B);
		long L = max;
		int count = 0;
		if( max<10000000 ){

		for( long i=2; i<=L; i++ ){
			if( L%i==0 ){
				count++;
			}
			while(L%i==0){
				L = L/i;
			}           
		}
		
		}else{

		for( long i=2; i*i<=max; i++ ){
			if( L%i==0 ){
				count++;
			}
			while(L%i==0){
				L = L/i;
			}            
		}

		}

		System.out.println(count+1);     
	}
}
