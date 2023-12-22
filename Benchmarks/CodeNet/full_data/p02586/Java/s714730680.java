import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var r = sc.nextInt();
		var c = sc.nextInt();
		var k = sc.nextInt();
		var v = new long[r][c][5];
		for (var i = 0; i < k; i++) {
			v[sc.nextInt() - 1][sc.nextInt() - 1][0] = sc.nextInt();
		}
		sc.close();

		for (var i = 0; i < r; i++) {
			for (var j = 0; j < c; j++) {
				var cv = v[i][j][0];
				v[i][j][0] = 0;
				for (var ic = 0; ic < 4; ic++) {
					var rv1 = (i > 0 ? getValue(v, i - 1, j) : 0);
					var rv2 = (j > 0 ? v[i][j - 1][ic] : 0);
					var rv3 = (j > 0 ? v[i][j - 1][ic + 1] : 0);
					if (cv > 0) {
						if (ic == 0) {
							v[i][j][ic + 1] = Math.max(Math.max(rv1 + cv, rv2 + cv), rv3);
						} else if (rv2 > 0) {
							v[i][j][ic + 1] = Math.max(rv2 + cv, rv3);
						}
					} else {
						if (ic == 0) {
							v[i][j][ic] = Math.max(rv1, rv2);
						} else {
							v[i][j][ic] = rv2;
						}
					}
				}
				//System.out.printf("%d %d %d %d\r\n", v[i][j][0], v[i][j][1], v[i][j][2], v[i][j][3]);
			}
			//System.out.println("----------");
		}

		System.out.println(getValue(v, r - 1, c - 1));
	}

	private static long getValue(long[][][] v, int i, int j) {
		return Math.max(Math.max(Math.max(v[i][j][0], v[i][j][1]), v[i][j][2]), v[i][j][3]);
	}
}
