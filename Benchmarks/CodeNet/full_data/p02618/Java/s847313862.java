import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();

		int[] c = new int[27];
		for ( int i=1; i<27; i++ ) {
			c[i] = sc.nextInt();
		}

		int[][] s = new int[d][27];
		for ( int i=0; i<d; i++ ) {
		for ( int j=1; j<27; j++ ) {
			s[i][j] = sc.nextInt();
		}
		}

		int[] last = new int[27];
		for ( int i=0; i<d; i++ ) {
			int t = 0;
			int man = -999999999;

			for ( int j=1; j<27; j++ ) {
				int manj = 0;
				for ( int k=1; k<27; k++ ) {
					if ( j==k ) {
						manj += s[i][j];
					} else {
						manj -= (c[k]*((i+1)-last[k]));
					}
				}

				if ( manj>man || ( manj==man && c[j]>c[t] ) ) {
					man = manj;
					t = j;
				}
			}

			last[t] = i+1;
			System.out.println(t);
		}

	}
}