import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] body = s.toCharArray();
		char[] joint = s.toCharArray();
		int n = s.length();
		long k = in.nextLong();
		in.close();

		if ( n == 1 ) {
			System.out.println(k / 2);
			return;
		}

		long cnt1 = 0;
		for ( int i = 1; i < n; i++ ) {
			if ( body[i - 1] == body[i] ) {
				body[i] = '#';
				cnt1++;
			}
		}

		if ( body[n - 1] != body[0] ) {
			System.out.println(cnt1 * k);
			return;
		}

		long cnt2 = 0;
		if ( body[n - 1] == joint[0] ) {
			joint[0] = '#';
			cnt2++;
		}

		for ( int i = 1; i < n; i++ ) {
			if ( joint[i - 1] == joint[i] ) {
				joint[i] = '#';
				cnt2++;
			}
		}

		boolean last_is_First = false;
		if ( joint[n - 1] == body[0] ) {
			last_is_First = true;
			cnt2++;
		}

		long ans = cnt1 * ((k + 1L) / 2L) + cnt2 * (k / 2L);
		if ( last_is_First && k % 2 == 0 ) ans -= 1L;
		System.out.println(ans);
	}
}