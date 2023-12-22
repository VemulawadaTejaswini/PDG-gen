import java.util.*;

public class Main {
	public static void main ( String args[] ) {
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext() ) {
			int n = sc.nextInt();
			for ( int i = 0; i < n; i++ ) {
				double x1 , y1 , x2 , y2 , x3 , y3 , x4 , y4;
				x1 = sc.nextDouble();
				y1 = sc.nextDouble();
				x2 = sc.nextDouble();
				y2 = sc.nextDouble();
				x3 = sc.nextDouble();
				y3 = sc.nextDouble();
				x4 = sc.nextDouble();
				y4 = sc.nextDouble();
				Double X1 , Y1 , X2 , Y2;
				X1 = x2-x1;
				Y1 = y2-y1;
				X2 = x4-x3;
				Y2 = y4-y3;
				Double a1 , a2;
				a1 = Y1 / X1;
				a2 = Y2 / X2;
				if ( a1.equals(a2) )
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
}