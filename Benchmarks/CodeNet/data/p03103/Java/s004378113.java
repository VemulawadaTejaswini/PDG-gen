import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		ArrayList<P> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new P(in.nextLong(), in.nextInt()));
		}
		Collections.sort(list);
		long ret = 0;
		for (P p : list) {
			if (m > p.b) {
				m -= p.b;
				ret += p.a * p.b;
			} else {
				ret += p.a * m;
				break;
			}
		}
		System.out.println(ret);
	}

	static class P implements Comparable<P> {
		long a;
		int b;

		P(long a , int b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(P o) {
			long d = this.a - o.a;
			if (d > 0) {
				return 1;
			} else if (d == 0) {
				return 0;
			}  else {
				return -1;
			}
		}
	}
}
