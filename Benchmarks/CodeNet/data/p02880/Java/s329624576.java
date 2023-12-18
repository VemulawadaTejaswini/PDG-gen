import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int res = sc.nextInt();
		if( res < 0 || res > 100) {
			System.err.println("res is not in [0,100]");
			System.exit(1);
		}
		for( int j = 1 ; j <= 9 ; j++) {
			for(int k = 1 ; k <= 9 ; k++) {
				if( (j * k) == res) {
					flag = true;
					break;
				}
			}
		}
		if( flag ) {
			System.out.println( "Yes" );
		}
		else {
			System.out.println("No");
		}
	}
}
