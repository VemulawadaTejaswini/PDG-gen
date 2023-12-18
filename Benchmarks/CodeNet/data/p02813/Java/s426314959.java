import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt(); sc.nextLine();
		// スペース区切りの整数の入力
		String[] p = new String[n];
		String[] q = new String[n];
		String[] c = new String[n];
		int[] s = new int[n];
		int[] t = new int[n];
		int[] f = {1, 1, 2, 6, 24, 120, 720, 5040};

		p = sc.nextLine().split(" ");
		q = sc.nextLine().split(" ");

		for ( int i=0; i<n; i++ ) {
			c[i] = String.valueOf(i+1);
		}

		per(p, s, c);
		per(q, t, c);

		int df = 0;

		for ( int i=0; i<n-1; i++ ) {
			df = df + ( (s[i]-t[i]) * f[n-i-1] );
		}
		df = Math.abs(df);

		// 出力
		System.out.println(df);
	}

	private static void per(String[] ary, int[] pos, String[] cst){
		String gai = "";
		for ( int j=0; j<ary.length; j++ ) {
			int ps = 0;
			for ( int k=0; k<cst.length; k++ ) {
				if ( gai.contains(cst[k]) ) {
				} else {
					ps++;
					if ( cst[k].equals(ary[j]) ) {
						pos[j] = ps;
						gai = gai.concat(ary[j]);
						continue;
					}
				}
			}
		}
	}
}

