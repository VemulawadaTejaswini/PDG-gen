import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long NN = sc.nextLong();
		long a = 0;
		long b = 0; 
		String S = String.valueOf(NN);
		int R = S.length()/2+1;
		if( R<3 ){
			R = S.length();
		}    
		long c = 1;
		for( int i=0; i<R; i++ ){
			c = c*10;
		}
		for( int i=1; i<=c; i++ ){
			a++;
			b = NN/a;
			if( a>=b && NN%a==0 ){
				break;
			}
			if( i==c ){
				a = NN;
				b = 1;
			}
		}
		System.out.println((a-1)+(b-1));
	}
}
