import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[] count = new int[30];
	static ArrayList<Person> ps = new ArrayList<Person>();

	public static void main(String[] args) throws Exception {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			Arrays.fill(count, 0);
			ps.clear();
			for (int i = 0; i < N; ++i) {
				Person p = new Person();
				p.name = sc.next();
				int m = sc.nextInt();
				p.d = new int[m];
				for (int j = 0; j < m; ++j) {
					p.d[j] = sc.nextInt();
					++count[p.d[j]];
				}
				ps.add(p);
			}
			Collections.sort(ps);
			System.out.println(ps.get(0).val() + " " + ps.get(0).name);
		}
	}

	static class Person implements Comparable<Person> {
		String name;
		int[] d;

		public int compareTo(Person o) {
			if (this.val() != o.val()) {
				return this.val() < o.val() ? -1 : 1;
			}
			return this.name.compareTo(o.name);
		}

		int val() {
			int ret = 0;
			for (int t : this.d) {
				ret += N - count[t] + 1;
			}
			return ret;
		}

	}
}