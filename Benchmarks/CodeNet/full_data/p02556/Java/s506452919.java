import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var x = new int[n];
		var y = new int[n];
		for (var i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();

		var x1 = Integer.MAX_VALUE;
		var x2 = Integer.MIN_VALUE;
		for (var i = 0; i < n; i++) {
			x1 = Math.min(x1, x[i]);
			x2 = Math.max(x2, x[i]);
		}
		var x1a = Integer.MAX_VALUE;
		var x1b = Integer.MIN_VALUE;
		var x2a = Integer.MAX_VALUE;
		var x2b = Integer.MIN_VALUE;
		for (var i = 0; i < n; i++) {
			if (x[i] == x1) {
				x1a = Math.min(x1a, y[i]);
				x1b = Math.max(x1b, y[i]);
			}
			if (x[i] == x2) {
				x2a = Math.min(x2a, y[i]);
				x2b = Math.max(x2b, y[i]);
			}
		}

		var y1 = Integer.MAX_VALUE;
		var y2 = Integer.MIN_VALUE;
		for (var i = 0; i < n; i++) {
			y1 = Math.min(y1, y[i]);
			y2 = Math.max(y2, y[i]);
		}
		var y1a = Integer.MAX_VALUE;
		var y1b = Integer.MIN_VALUE;
		var y2a = Integer.MAX_VALUE;
		var y2b = Integer.MIN_VALUE;
		for (var i = 0; i < n; i++) {
			if (y[i] == y1) {
				y1a = Math.min(y1a, x[i]);
				y1b = Math.max(y1b, x[i]);
			}
			if (y[i] == y2) {
				y2a = Math.min(y2a, x[i]);
				y2b = Math.max(y2b, x[i]);
			}
		}

		var max = 0;
		max = Math.max(max, Math.abs(x1 - x2) + Math.max(Math.abs(x1a - x2b), Math.abs(x1b - x2a)));
		max = Math.max(max, Math.abs(y1 - y2) + Math.max(Math.abs(y1a - y2b), Math.abs(y1b - y2a)));
		max = Math.max(max, Math.max(Math.abs(x1 - y1a), Math.abs(x1 - y1b)) + Math.max(Math.abs(x1a - y1), Math.abs(x1b - y1)));
		max = Math.max(max, Math.max(Math.abs(x1 - y2a), Math.abs(x1 - y2b)) + Math.max(Math.abs(x1a - y2), Math.abs(x1b - y2)));
		max = Math.max(max, Math.max(Math.abs(x2 - y1a), Math.abs(x2 - y1b)) + Math.max(Math.abs(x2a - y1), Math.abs(x2b - y1)));
		max = Math.max(max, Math.max(Math.abs(x2 - y2a), Math.abs(x2 - y2b)) + Math.max(Math.abs(x2a - y2), Math.abs(x2b - y2)));
		System.out.println(max);
	}
}
