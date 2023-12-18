import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int x = sc.nextInt();

		int y = 0;
		int r = (int)Math.sqrt(x);

		while ( y == 0 ) {
			int f = 0;
			for ( int i=2; i<=r; i++ ) {
				if ( x%i == 0 ) {
					f = i;
					break;
				}
			}
			if ( f == 0 ) {
				y = x ;
			} else {
				x++;
			}
		}
		System.out.println(y);
	}
}