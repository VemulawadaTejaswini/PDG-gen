import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		int[] r = new int[n];
		int[] w = new int[n];
		int cr = 0;
		int cw = 0;
		for ( int i=0; i<n; i++ ) {
			if ( s.charAt(i)=='R' )	{
				r[cr] = i;
				cr++;
			} else {
				w[cw] = i;
				cw++;
			}
		}

		int minc = Math.min(cr, cw);
		if ( minc==0 ) {
			System.out.println(0);
			System.exit(0);
		}

		int t = 0;
		int maxr = cr-1;
		int minw = 0;

		while ( minc>0 && r[maxr]>w[minw] ) {

			t++;
			maxr--;
			minw++;
			minc--;
		}
		System.out.println(t);
	}
}