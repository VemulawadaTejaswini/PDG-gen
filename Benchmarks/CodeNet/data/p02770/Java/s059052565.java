import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int k = sc.nextInt();
		int q = sc.nextInt();

		int[] d = new int[k];
		for ( int i=0; i<k; i++ ) {
			d[i] = sc.nextInt();
		}

		for ( int i=0; i<q; i++ ) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int m = sc.nextInt();

			int p = 0;
			int aj = x%m;
			for ( int j=1; j<n; j++ ) {
				int aj1 = ( aj + d[(j-1)%k] ) % m ;
				if ( aj < aj1 ) {
					p++;
				}
				aj = aj1;
			}
			System.out.println(p);
		}
	}
}