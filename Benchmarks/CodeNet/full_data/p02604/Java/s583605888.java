import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	private static int[] numbers2 = IntStream.range(0, 16).map(i -> (int) Math.pow(2, i)).toArray();

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var x = new int[n];
		var y = new int[n];
		var p = new int[n];
		for (var i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		sc.close();

		var mins = new long[n + 1];
		for (var i = 0; i <= n; i++) {
			mins[i] = Long.MAX_VALUE;
		}
		check(x, y, p, mins);
		for (var i = 0; i <= n; i++) {
			System.out.println(mins[i]);
		}
	}

	private static void check(int[] x, int[] y, int[] p, long[] mins) {
		var xdists = new int[x.length][x.length];
		var ydists = new int[x.length][x.length];
		for (var i = 0; i < x.length; i++) {
			for (var j = 0; j < x.length; j++) {
				xdists[i][j] = Math.abs(x[i] - x[j]);
				ydists[i][j] = Math.abs(y[i] - y[j]);
			}
		}

		var xmins = new int[x.length][(int) Math.pow(2, x.length)];
		var ymins = new int[x.length][(int) Math.pow(2, x.length)];
		for (var i = 0; i < x.length; i++) {
			var values2 = new int[x.length + 1];
			for (var j = 0; j < (int) Math.pow(2, x.length); j++) {
				xmins[i][j] = Math.abs(x[i]);
				ymins[i][j] = Math.abs(y[i]);
				for (var k = 0; k < x.length; k++) {
					if (values2[k] == 1) {
						xmins[i][j] = Math.min(xmins[i][j], xdists[i][k]);
						ymins[i][j] = Math.min(ymins[i][j], ydists[i][k]);
					}
				}
				incValues(values2, 2);
			}
		}

		var values3 = new int[x.length + 1];
		for (var i = 0; i < Math.pow(3, x.length); i++) {
			var count = 0;
			var xnumber = 0;
			var ynumber = 0;
			for (var j = 0; j < x.length; j++) {
				if (values3[j] == 1) {
					xnumber += numbers2[j];
					count++;
				} else if (values3[j] == 2) {
					ynumber += numbers2[j];
					count++;
				}
			}

			var sum = 0L;
			for (var j = 0; j < x.length; j++) {
				sum += (long) Math.min(xmins[j][xnumber], ymins[j][ynumber]) * p[j];
			}
			mins[count] = Math.min(mins[count], sum);
			incValues(values3, 3);
		}
	}

	public static void incValues(int[] values, int b) {
		values[0]++;
		for (var i = 0; i < values.length; i++) {
			if (values[i] < b) {
				break;
			}
			values[i] = 0;
			values[i + 1]++;
		}
	}
}
