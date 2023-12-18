import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong(), b = in.nextLong();
		in.close();
		long targ = getGCD(a, b);
		long limit = targ / 2;

		long cnt = 0;
		if ( targ != 0 && targ % 2 == 0 ) {
			targ /= 2;
			cnt++;
		}

		Long div = 3L;
		while ( div <= limit ) {
			if ( targ % div == 0 ) {
				cnt++;
			}
			while ( targ % div == 0 ) {
				targ /= div;
			}
			div += 2;
		}
		System.out.println(cnt + 1);
	}

	private static long getGCD(long a, long b) {
		if ( b == 0 ) return a;
		else return getGCD(b, a % b);
	}
}