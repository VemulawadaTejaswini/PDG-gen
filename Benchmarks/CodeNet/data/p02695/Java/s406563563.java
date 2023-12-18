import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var m = sc.nextInt();
		var q = sc.nextInt();
		var a = new int[q];
		var b = new int[q];
		var c = new int[q];
		var d = new int[q];
		for (var i = 0; i < q; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		sc.close();

		var maxpoint = 0;
		List<String> list = new ArrayList<String>();
		create(n, m, "", list);
		for (var text : list) {
			var point = 0;
			for (var i = 0; i < q; i++) {
				int an = Integer.parseInt(text.substring(a[i] - 1, a[i]));
				int bn = Integer.parseInt(text.substring(b[i] - 1, b[i]));
				if (bn - an == c[i]) {
					point += d[i];
				}
			}
			maxpoint = Math.max(maxpoint, point);
		}
		System.out.println(maxpoint);
	}

	public static void create(int n, int m, String text, List<String> texts) {
		if (text.length() == n) {
			texts.add(text);
			return;
		}

		var s = 0;
		if (text.length() > 0) {
			s = Integer.parseInt(text.substring(text.length() - 1, text.length()));
		}

		for (int i = s; i < m; i++) {
			create(n, m, text + i, texts);
		}
	}
}