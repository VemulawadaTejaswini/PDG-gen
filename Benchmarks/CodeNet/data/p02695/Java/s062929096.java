import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];

		int m = sc.nextInt();
		int q = sc.nextInt();

		int[] a = new int[q];
		int[] b = new int[q];
		int[] c = new int[q];
		int[] d = new int[q];

		for ( int i=0; i<q; i++ ) {
			a[i] = sc.nextInt()-1;
			b[i] = sc.nextInt()-1;
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}

		int g = 0;

		while ( x[0]<m ) {
			nextArray(x, n, m);
			int g1 = 0;
			for ( int i=0; i<q; i++ ) {
				if ( x[b[i]]-x[a[i]]==c[i] ) g1+=d[i];
			}
			g = Math.max(g, g1);
		}
		System.out.println(g);
	}

	private static void nextArray( int[] ary, int sz, int mx) {
		if ( ary[0]==0 ) {
			for ( int i=0; i<sz; i++ ) {
				ary[i]++;
			}
		} else if ( ary[sz-1]<mx ) {
			ary[sz-1]++;
		} else {
			int f = sz-1;
			while ( ary[f]==mx ) {
				f--;
			}
			ary[f]++;
			for ( int i=f+1; i<sz; i++ ) {
				ary[i] = ary[f];
			}
		}
	}
}