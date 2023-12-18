import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long s = in.nextLong();
		long limit = (long) Math.pow(10, 9);
		final long x2 = limit;
		final long y2 = 1;
		long x3 = limit;
		long y3 = (long) Math.sqrt(s);

		for ( ; y3 <= limit; y3++ ) {
			for ( x3 = limit; 0 <= x3; x3-- ) {
				long temp = Math.abs(x2 * y3 - y2 * x3);
				if ( temp == s ) {
					System.out.println("0 0 " + x2 + " 1 " + x3 + " " + y3);
					in.close();
					return;
				}
				// 通り過ぎてしまったら上の行へ
				else if(temp > s) {
					break;
				}
			}
		}
		in.close();
    }
}
