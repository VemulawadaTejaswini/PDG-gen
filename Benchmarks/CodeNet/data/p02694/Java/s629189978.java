import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long X = sc.nextLong();
		int count = 0;
		long A = 100;
		for( int i=0; i<4000; i++ ){
			A = A+A/100;
			count++;
			if( A>=X ){
				break;
			}
		}
		System.out.println(count);
	}
}