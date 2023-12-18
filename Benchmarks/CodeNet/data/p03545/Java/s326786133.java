import java.util.Scanner;
public class Main {
	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		
		int abcd = sc.nextInt();
		int[] a = new int[4];
		a[0] = (abcd/1000)%10;
		a[1] = (abcd/100)%10;
		a[2] = (abcd/10)%10;
		a[3] = abcd%10;
		char[] op = new char[3];
		for( int i = 0; i < (1<<3); i++ ) {
			int sum = a[0];
			for( int j = 0; j < 3; j++ ) {
				if( (1&(i>>j)) == 1 ) {
					sum += a[j+1];
					op[j] = '+';
				}
				else {
					sum -= a[j+1];
					op[j] = '-';
				}
			}
			
			if( sum == 7 ) {
				for( int j = 0; j < 4; j++ ) {
					if( j != 3 )
						System.out.print( a[j] + "" + op[j] );
					else
						System.out.println( a[j] + "=7" );
				}
			}
		}
		
		sc.close();
	}
}
