import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Rest[] arr = new Rest[n];
		for (int i = 0; i < n; i++) {
			Rest r = new Rest();
			r.s = sc.next();
			r.p = sc.nextInt();
			r.i = i + 1;
			arr[i] = r;
		}
		sc.close();

		Arrays.parallelSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].i);
		}
	}

	static class Rest implements Comparable<Rest> {
		String s;
		int p, i;

		public int compareTo(Rest o) {
			if (s.equals(o.s)) {
				return o.p - p;
			} else {
				return s.compareTo(o.s);
			}
		}
	}
}
