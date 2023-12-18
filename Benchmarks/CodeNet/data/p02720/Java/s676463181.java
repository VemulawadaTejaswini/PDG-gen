import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextInt();

		long l = 0;
		long m = 1;

		while (k>0) {
    		l++;
    		if( isLunlun(l)) {
    			k--;
    			System.err.println(l);
    		}
    	}
		System.out.println(l);
	}

	private static boolean isLunlun(long l) {
		
		while( l>9 ) {
			long p1 = l % 10;
			l/=10;
			
			long p2 = l % 10;
			
			if( Math.abs(p1-p2) > 1 )
				return false;
			
		}
		
		return true;
	}
}