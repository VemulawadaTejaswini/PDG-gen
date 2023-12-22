import java.util.*;

/* No.10030 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[100],
		t = new int[100];
		int n = sc.nextInt();
		for ( int i = 0; i < n; i++ )
			s[i] = sc.nextInt();
		int m = sc.nextInt();
		for ( int i = 0; i < m; i++ ) {
			t[i] = sc.nextInt();
		}
		int count = 0;
		for ( int i = 0; i < n; i++ ) {
			for ( int j = 0; j < m; j++ )
				if ( s[i] == t[j] )
					count++;
		}
		System.out.println(count);
	}
}