import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = sc.nextLong();
		long count = 0;
		char c = ' ';
		if ((K >= 2 && S.charAt(0)== S.charAt(S.length()-1) && S.charAt(0) == S.charAt(S.length()-2))
			|| (K >= 2 && S.charAt(0)== S.charAt(S.length()-1) && S.charAt(0) == S.charAt(1))
				||
		(S.charAt(0) != S.charAt(S.length()-1)) ){
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) == c) {
					count++;
					i++;
				}
				if (i >= S.length())
					break;
				c = S.charAt(i);
			}
			long ans = count * K;
			System.out.println(K*count);
		}else {
			long count0 = 0;
			long count1 = 1;
			long ans = 0;
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) == c) {
					count0++;
					i++;
				}
				if (i >= S.length())
					break;
				c = S.charAt(i);
			}
			c = ' ';

			for (int i = 1; i < S.length(); i++) {
				if (S.charAt(i) == c) {
					count1++;
					i++;
				}
				if (i >= S.length())
					break;
				c = S.charAt(i);
			}
			if (K % 2 == 0) {
				ans = count0 * (K/2) + count1 *(K/2);
			} else {
				ans = count0 * (K/2) + count1 *(K/2) + count0;
			}
			System.out.println(ans);
		}
	}
}