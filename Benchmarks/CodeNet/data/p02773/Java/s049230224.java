import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		String[] s = new String[n];
		for ( int i=0; i<n; i++ ) {
			s[i] = sc.next();
		}
		Arrays.sort(s);

		int t = 0;
		int[] a = new int[n];
		int g = 0;

		a[0] = 0;
		for ( int i=1; i<n; i++ ) {
			if ( s[i].equals(s[i-1]) ) {
				t++;
			} else {
				g = Math.max(g,t);
				t = 0;
			}
			a[i] = t;
		}
		g = Math.max(g,t);

		for ( int i=0; i<n; i++ ) {
			if ( a[i] == g ) {
				System.out.println(s[i]);
			}
		}

	}
}