import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] b = new int[n];

		for ( int i=0; i<n; i++ ) {
			int a = sc.nextInt();
			for ( int j=a; j>=a*(-1); j-- ) {
				if ( i+j>=0 && i+j<n ) b[i+j]++;
			}
		}

		for ( int i=1; i<k; i++ ) {
			int[] c = new int[n];
			for ( int h=0; h<n; h++ ) {
				c[h] = b[h];
				b[h] = n;
			}

			int f = 0;
			for ( int h=0; h<n; h++ ) {
				int mn = h-c[h];
				int mx = h+c[h];
				for ( int j=0; j<n; j++ ) {
					if ( j<mn || mx<j ) {
						b[j]--;
						f++;
					}
				}
			}
			if ( f==0 ) {
				String[] s1 = new String[n];
				Arrays.fill(s1, String.valueOf(n));
				System.out.println(String.join(" ",s1));
				System.exit(0);
			}
		}

		String[] s = new String[n];
		for ( int i=0; i<n; i++ ) {
			s[i] = String.valueOf(b[i]);
		}

		System.out.println(String.join(" ",s));
	}
}