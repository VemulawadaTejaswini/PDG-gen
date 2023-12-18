import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong(), b = in.nextLong();
		in.close();
		long targ = getGCD(a, b);

		ArrayList<Long> pfac = new ArrayList<Long>();
		if ( targ != 0 && targ % 2 == 0 ) {
			targ /= 2;
			pfac.add((Long) 2L);
		}
		
		Long div = 3L;		
		while ( div <= targ ) {
			if ( targ % div == 0 ) {
				pfac.add(div);
			}
			while ( targ % div == 0 ) {
				targ /= div;
			}
			div += 2;
		}
		System.out.println(pfac.size() + 1);
	}

	private static long getGCD(long a, long b) {
		if ( b == 0 ) return a;
		else return getGCD(b, a % b);
	}
}