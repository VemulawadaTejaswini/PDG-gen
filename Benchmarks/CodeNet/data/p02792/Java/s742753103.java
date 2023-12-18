import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int n = sc.nextInt();

		long c = 0;

		for ( int i=1; i<10; i++ ) {
			for ( int j=1; j<10; j++ ) {
				long c1 = 0;
				long c2 = 0;
				// i=jの場合、一桁を考慮する
				if (i==j && i<=n) {
					c1++;
					c2++;
				}
				for ( int k=0; k<5; k++ ) {
					// min1 = i0000j
					int min1 = defmin(String.valueOf(i), String.valueOf(j), k);
					if ( min1 > n ) {
						break;
					}
					// max1 = i9999j
					int max1 = defmax(String.valueOf(i), String.valueOf(j), k);
					if ( max1 <= n ) {
						c1 = c1 + (long)Math.pow(10,k);
						continue;
					} else {
						// i0000j <= n(=ixxxx#) < i9999j
						String a = String.valueOf(n);
						// n(=ixxxx#) からxxxx取り出し
						String b = a.substring(1,a.length()-1);
						int p = Integer.valueOf(b);
						// ixxxxj 計算
						String l = String.valueOf(i);
						l = l.concat(b);
						l = l.concat(String.valueOf(j));
						int il = Integer.valueOf(l);
						// n(=ixxxx#) と ixxxxj の比較
						if ( il <= n ) {
							c1 = c1 + (long)(p+1);
						} else {
							c1 = c1 + (long)(p);
						}
					}
				}
				for ( int k=0; k<5; k++ ) {
					// min2 = j0000i
					int min2 = defmin(String.valueOf(j), String.valueOf(i), k);
					if ( min2 > n ) {
						break;
					}
					// max2 = j9999i
					int max2 = defmax(String.valueOf(j), String.valueOf(i), k);
					if ( max2 <= n ) {
						c2 = c2 + (long)Math.pow(10,k);
						continue;
					} else {
						// j0000i <= n(=jxxxx#) < j9999i
						String a = String.valueOf(n);
						// n(=jxxxx#) からxxxx取り出し
						String b = a.substring(1,a.length()-1);
						int p = Integer.valueOf(b);
						// jxxxxi 計算
						String l = String.valueOf(j);
						l = l.concat(b);
						l = l.concat(String.valueOf(i));
						int il = Integer.valueOf(l);
						// n(=jxxxx#) と jxxxxi の比較
						if ( il <= n ) {
							c2 = c2 + (long)(p+1);
						} else {
							c2 = c2 + (long)(p);
						}
					}
				}
				c = c + (long)(c1*c2);
			}
		}
		System.out.println(c);
	}
	private static int defmin(String c1, String c2, int z) {
		String s = c1;
		for ( int i=0; i<z; i++ ) {
			s = s.concat("0");
		}
		s = s.concat(c2);
		return Integer.valueOf(s);
	}
	private static int defmax(String c1, String c2, int z) {
		String s = c1;
		for ( int i=0; i<z; i++ ) {
			s = s.concat("9");
		}
		s = s.concat(c2);
		return Integer.valueOf(s);
	}
}