import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			long x = sc.nextLong();
			long k = sc.nextLong();
			long d = sc.nextLong();
			
			
			long ans = 0;
			long step = x / d;
			if ( k <= step ) {
				ans = x - k * d;
			}
			else {
				long additionalStep = k - step;
				if ( additionalStep % 2 == 0 ) {
					//positive case
					ans = x % d;
				}
				else {
					ans = d - (x % d);
				}
				
//				long res = x % d;
//				if ( res <= d - res ) {
//					//positive is min
//					long additionalStep = k - step;
//				}
//				else {
//					//negative is min
//				}
			}
			
			System.out.println(ans);
		}
	}

}