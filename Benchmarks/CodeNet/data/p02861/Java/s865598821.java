import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static double[][]	tb;
	static double		total	= 0;
	static int			n		= 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		Town[] towns = new Town[n];
		for ( int i = 0; i < n; i++ ) {
			towns[i] = new Town();
			towns[i].x = in.nextInt();
			towns[i].y = in.nextInt();
		}
		in.close();

		tb = new double[n][n];

		// f:from t:to
		for ( int f = 0; f < n; f++ ) {
			for ( int t = 0; t < n; t++ ) {
				tb[f][t] = Math.sqrt(Math.pow(towns[f].x - towns[t].x, 2) + Math.pow(towns[f].y - towns[t].y, 2));
			}
		}

		// s:start
		for ( int s = 0; s < n; s++ ) {
			ArrayList<Integer> passed = new ArrayList<>();
			passed.add(s);
			total += calc(0.0, passed);
		}

		while ( n > 0 ) {
			total /= n;
			n--;
		}
		System.out.println(total);

	}

	public static double calc(double subtotal, ArrayList<Integer> passed) {
		if ( passed.size() >= n ) {
//			for ( Integer i : passed ) {
//				System.out.print((i + 1) + " ");
//			}
//			System.out.println("subtotal " + subtotal);
//			System.out.println();			
			return subtotal;
		}
		
		int pre = passed.get(passed.size() - 1);
		double toreturn = 0.0;

		// 未訪問の町を見つける
		for ( int now = 0; now < n; now++ ) {
			if ( passed.contains((Integer) now) ) continue;

			// 見つかったら
			ArrayList<Integer> newpassed = new ArrayList<>(passed);			
			newpassed.add((Integer) now);
			toreturn += calc(subtotal + tb[pre][now], newpassed);
		}	
		
		return toreturn;
	}
}

class Town {

	int	x	= 0;
	int	y	= 0;
}