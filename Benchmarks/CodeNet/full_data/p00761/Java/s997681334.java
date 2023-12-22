import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			StringBuilder s = new StringBuilder(sc.next());
			int L = sc.nextInt();
			if (L == 0) {
				break;
			}
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

			int cnt = 0;
			while (true) {
				if (map.get(Integer.parseInt(s.toString())) != null) {
					System.out.print(map.get(Integer.parseInt(s.toString())));
					System.out.print(" " + Integer.parseInt(s.toString()));
					System.out.println(" " + (cnt - map.get(Integer.parseInt(s.toString()))));
					break;
				}
				map.put(Integer.parseInt(s.toString()), cnt++);
				while (s.length() < L) {
					s = s.reverse().append("0").reverse();
				}
				char[] a = s.toString().toCharArray();
				Arrays.sort(a);

				int ka = 0, kb = 0;
				for (int i = 0; i < L; i++) {
					ka *= 10;
					ka += a[i] - '0';
				}
				for (int i = L - 1; 0 <= i; i--) {
					kb *= 10;
					kb += a[i] - '0';
				}
				int next = kb - ka;
				s = new StringBuilder("" + next);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}