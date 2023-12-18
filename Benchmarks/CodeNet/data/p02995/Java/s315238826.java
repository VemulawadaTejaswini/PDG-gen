import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		long cnt = 0;
		long cd = c * d;

		// 頭の１行
		long head = 0;
		for ( long targ = 1; targ < a; targ++ ) {
			if ( targ % c != 0 && targ % d != 0 ) {
				head++;
			}
		}
		//System.out.println(head);

		long botomRight = b - (b % cd);
		//System.out.println(botomRight);
		long bodyCnt = botomRight * (cd - c - d + 1) / cd;
		//System.out.println(bodyCnt);
	
		for ( long targ = botomRight + 1; targ <= b; targ++ ) {
			if ( targ % c != 0 && targ % d != 0 ) {
				cnt++;
			}
		}
		//System.out.println(cnt);

		System.out.println(bodyCnt - head + cnt);
		in.close();
	}
}