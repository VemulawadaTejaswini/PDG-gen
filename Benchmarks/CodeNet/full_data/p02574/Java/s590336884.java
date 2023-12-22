import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var a = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		sc.close();

		Arrays.sort(a);
		var set = new HashSet<Integer>();
		var gcd = 0;
		var check = false;
		for (var i = 0; i < n; i++) {
			if (i == 0) {
				gcd = a[0];
			} else {
				gcd = gcd(gcd, a[i]);
			}
			if (!check) {
				for (var div : getDivisors(a[i])) {
					if (set.contains(div)) {
						check = true;
					}
					set.add(div);
				}
			}
		}

		if (gcd > 1) {
			System.out.println("not coprime");
		} else if (check) {
			System.out.println("setwise coprime");
		} else {
			System.out.println("pairwise coprime");
		}
	}

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static List<Integer> getDivisors(int n) {
		var list = new ArrayList<Integer>();
		for (var i = 1; i < (long) Math.sqrt(n) + 1; i++) {
			if (n % i == 0) {
				list.add(i);
				var divisor = n / i;
				if (divisor != i) {
					list.add(divisor);
				}
			}
		}

		Collections.sort(list);
		list.remove(0);
		return list;
	}
}
