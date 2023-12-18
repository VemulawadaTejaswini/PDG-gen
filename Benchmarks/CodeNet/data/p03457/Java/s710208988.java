import java.util.*;


class Main {
	
	public static int startX = 0;
	public static int startY = 0;


	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int time = 0;
		int x = 0;
		int y = 0;

		boolean result = true;

		for ( int i = 0; i < N; i++ ) {

			time = sc.nextInt() - time;
			x = sc.nextInt();
			y = sc.nextInt();

			if (result) {
				
				result = check(time, x, y);
				startX = x;
				startY = y;

			}

		}

		System.out.println( (result) ? "Yes" : "No" );

	}

	public static boolean check(int time, int x, int y) {
		int ckX = startX;
		int ckY = startY;
		for ( int i = 0; i < time; i++ ) {
			if ( ckX != x ) {
				ckX = ( ckX < x ) ? ckX + 1 : ckX - 1;
			} else {
				ckY = ( ckY < y ) ? ckY + 1 : ckY - 1;
			}
		}
		
		return ( ckX == x && ckY == y );
	}

}