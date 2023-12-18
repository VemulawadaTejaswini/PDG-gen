import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		char[] c = sc.next().toCharArray();
		sc.close();

		int min = a.length + b.length + c.length;
		min = Math.min(min, mins3(a, b, c));
		min = Math.min(min, mins3(a, c, b));
		min = Math.min(min, mins3(b, a, c));
		min = Math.min(min, mins3(b, c, a));
		min = Math.min(min, mins3(c, a, b));
		min = Math.min(min, mins3(c, b, a));
		System.out.println(min);
	}

	static int mins3(char[] x, char[] y, char[] z) {
		int min = x.length + y.length + z.length;
		int yzmax = Math.max(y.length, z.length);
		for ( int i = 0 ; i < x.length ; i++ ) {
			if ( min <= Math.max(x.length, i + yzmax) ) {
				return min;
			}
			boolean match = true;
			for ( int j = 0 ; j < y.length ; j++ ) {
				if ( i + j >= x.length ) {
					break;
				}
				if ( x[i + j] != '?' && y[j] != '?' && x[i + j] != y[j] ) {
					match = false;
					break;
				}
			}
			if ( match ) {
				min = Math.min(min, mins2(x, y, z, i));
			}
		}
		min = Math.min(min, mins2(x, y, z, x.length));
		return min;
	}

	static int mins2(char[] x, char[] y, char[] z, int start) {
		int xyend = Math.max(x.length, start + y.length);
		for ( int i = start ; i < xyend ; i++ ) {
			boolean match = true;
			for ( int j = 0 ; j < z.length ; j++ ) {
				if ( i + j >= xyend ) {
					break;
				}
				if ( i + j < x.length && x[i + j] != '?' && z[j] != '?' && x[i + j] != z[j] ) {
					match = false;
					break;
				}
				if ( i + j < start + y.length && y[i + j - start] != '?' && z[j] != '?' && y[i + j - start] != z[j] ) {
					match = false;
					break;
				}
			}
			if ( match ) {
				return Math.max(xyend, i + z.length);
			}
		}
		return xyend + z.length;
	}
}
