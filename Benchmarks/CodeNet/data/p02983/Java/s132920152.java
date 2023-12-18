
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = 2019;
		int l = sc.nextInt();
		int r = sc.nextInt();
		
		int lm = l % m;
		int rm = r % m;
		int ld = l / m;
		int rd = r / m;		
		int minl = Integer.MAX_VALUE;
		
		boolean isLap = rd -ld > 0;
		if( lm == 0 || rm==0 || isLap ) {
			minl = 0;
		}else {
			for( int i=lm ; i< rm ; i++ ) {
				for( int j=lm+1 ; j<= rm ; j++ ) {
					int tmp=(i*j)%m;
					if(  minl > tmp ) {
						minl = tmp;
					}
				}
			}
		}
		
		System.out.println(minl);
	}
}
