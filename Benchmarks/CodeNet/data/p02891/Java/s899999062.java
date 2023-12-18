import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		int n = s.length;
		int k = in.nextInt();
		in.close();
		
		if(n == 1) {
			System.out.println(k/2);
			return;
		}

		long cnt = 0;
		boolean lastChnged = false;
		
		for ( int i = 1; i < n; i++ ) {
			if ( s[i - 1] == s[i] ) {
				// System.out.print(i + " ");
				cnt++;
				if ( i == n - 1 ) lastChnged = true;
				i++;
			}
		}
		if (!lastChnged && s[0] == s[n - 1] && k != 1) cnt++;
		// System.out.println();

		System.out.println(cnt*k);
		

	}
}