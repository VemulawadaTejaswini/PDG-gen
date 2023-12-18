import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long a = 1;
		long count = 0;
		for( int i=1; i<=N; i++ ){
			a = (a*i)%1000000007L;
		}
		long b = 0;
		long c = 0;
		while( c<=a ){
			b++;
			c = b*b;			
		}       
		for( long i=b-1; i>=1; i-- ){        
			if( a%i==0 ){
				count++;
			}
		} 
		long d = 0; //     
		if( c==a ){
			d = 1;          
        }          	//
		System.out.println(count*2+d);
	}
}
