import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var k = sc.nextLong();
		var a = new int[n];
		for (var i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		var list = new ArrayList<Integer>();
		var tn = 1;
		var count = 0;
		for (var i = 0; i < n; i++) {
			count++;
			tn = a[tn - 1];
			if (count == k) {
				break;
			}
			var i2 = list.indexOf(tn);
			if (i2 != -1) {
				var index2 = (int)(i2 + (k - count) % (list.size() - i2));
				tn = list.get(index2);
				break;
			}
			list.add(tn);
		}

		System.out.println(tn);
	}
}