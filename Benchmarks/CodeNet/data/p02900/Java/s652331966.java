import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong(), b = in.nextLong();
		in.close();
		long targ = getGCD(a, b);
		long cnt = 1;
		Long div = 2L;
		while ( div <= Math.sqrt(targ) ) {
			if ( targ % div == 0 ) cnt++;
			
			while ( targ % div == 0 ) targ /= div;
			
			div += 1;
		}

		if ( targ != 1 ) cnt++;
		System.out.println(cnt);
	}

	private static long getGCD(long a, long b) {
		if ( b == 0 ) return a;
		else return getGCD(b, a % b);
	}
}