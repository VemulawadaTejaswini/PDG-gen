import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			long a = sc.nextLong();
			long b = sc.nextLong();
			long n = sc.nextLong();
			
			long axb = (long)Math.floor(a*n/b);
			
			//axbとなるxの幅を求める
//			System.out.println(axb);
			long minx = 0;
			if ( axb * b % a == 0 ) {
				minx = (long)(axb * b / a);
			}
			else {
				minx = (long)(axb * b / a) + 1;
			}
			long maxx = 0;
			
			if  ( (axb+1) * b % a == 0 ) {
				maxx = (long)((axb+1) * b / a) - 1;
			}
			else {
				maxx = (long)((axb+1) * b / a);
			}
			
//			System.out.println("min: " + minx);
//			System.out.println("max: " + maxx);
			
			long minLater = Long.MAX_VALUE; 
			
			for(long i = minx ; i <= maxx ; i++ ) {
				//calc min 
				long tmp = (i / b);
				
				if ( tmp < minLater ) {
					minLater = tmp;
				}
			}
			
			long ans = axb - a * minLater;
			
			System.out.println(ans);
		}
	}

}