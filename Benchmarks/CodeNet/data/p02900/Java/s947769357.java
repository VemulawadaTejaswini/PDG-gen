import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong(), b = in.nextLong();
		in.close();
		long targ = getGCD(a, b);

		// System.out.println("targ:" + targ);
//		if ( targ == 1 ) {
//			System.out.println(1);
//			return;
//		}

		// 素因数分解
		long cnt = 0;
		if ( targ != 0 && targ % 2 == 0 ) {
			targ /= 2;
			cnt++;
			while ( targ % 2 == 0 ) {
				targ /= 2;
			}
		}

		Long div = 3L;
		while ( div <= Math.sqrt(targ) ) {
			if ( targ % div == 0 ) {
				// System.out.println("div:" + div);
				cnt++;
			}
			while ( targ % div == 0 ) {
				targ /= div;
			}
			div += 2;
		}

		if ( targ != 1 ) cnt++;
		System.out.println(cnt + 1);
	}

	private static long getGCD(long a, long b) {
		if ( b == 0 ) return a;
		else return getGCD(b, a % b);
	}
}