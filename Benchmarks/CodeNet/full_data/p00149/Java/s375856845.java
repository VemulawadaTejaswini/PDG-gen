import java.util.*;

public class Main {
	public int getIndex( int eye ) {
		if ( eye < 0.2 ) return 3;
		else if ( eye < 0.6 ) return 2;
		else if ( eye < 1.1 ) return 1;
		else return 0;
	}
	
	public static void main ( String args[] ) {
		int[] left = new int[4] , right = new int[4];
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext() ) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			left[m.getIndex(l)]++;
			right[m.getIndex(r)]++;
		}
		for ( int i = 0; i < 4; i++ )
			System.out.println(left[i]+" "+right[i]);
	}
}