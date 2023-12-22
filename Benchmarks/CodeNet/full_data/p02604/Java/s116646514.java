import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	private static int[] numbers2 = IntStream.range(0, 16).map(i -> (int) Math.pow(2, i)).toArray();
	private static int[] numbers3 = IntStream.range(0, 16).map(i -> (int) Math.pow(3, i)).toArray();

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

		var mins = new int[n + 1];
		for (var i = 0; i <= n; i++) {
			mins[i] = Integer.MAX_VALUE;
		}
		check(x, y, p, mins);
		for (var i = 0; i <= n; i++) {
			System.out.println(mins[i]);
		}
	}

	private static void check(int[] x, int[] y, int[] p, int[] mins) {
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
			for (var j = 0; j < (int) Math.pow(2, x.length); j++) {
				xmins[i][j] = Math.abs(x[i]);
				ymins[i][j] = Math.abs(y[i]);
				var values = getDigitValues(j, x.length, numbers2);
				for (var k = 0; k < x.length; k++) {
					if (values[k] == 1) {
						xmins[i][j] = Math.min(xmins[i][j], xdists[i][k]);
						ymins[i][j] = Math.min(ymins[i][j], ydists[i][k]);
					}
				}
			}
		}

		for (var i = 0; i < Math.pow(3, x.length); i++) {
			var values = getDigitValues(i, x.length, numbers3);
			var count = 0;
			var xnumber = 0;
			var ynumber = 0;
			for (var j = 0; j < x.length; j++) {
				if (values[j] == 1) {
					xnumber += numbers2[j];
					count++;
				} else if (values[j] == 2) {
					ynumber += numbers2[j];
					count++;
				}
			}

			var sum = 0;
			for (var j = 0; j < x.length; j++) {
				sum += Math.min(xmins[j][xnumber], ymins[j][ynumber]) * p[j];
			}
			mins[count] = Math.min(mins[count], sum);
		}
	}

	public static int[] getDigitValues(int n, int d, int[] numbers) {
		var values = new int[d];
		for (var i = 0; i < d; i++) {
			values[i] = (n % numbers[i + 1]) / numbers[i];
		}
		return values;
	}
}
