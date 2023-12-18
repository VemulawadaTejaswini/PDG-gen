import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Set<Integer> a = new TreeSet<>();
		Set<Integer> b = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		for (int i = 0; i < m; i++) {
			b.add(sc.nextInt());
		}
		int[][] grid = new int[n][m];
		long count = 1;
		long mod = 1000000007;
		int yoko = 0;
		int tate = 0;
		int used = 0;
		for (int i = n * m; i > 0; i--) {
			if (a.contains(i) && b.contains(i)) {
				yoko++;
				tate++;
			} else if (a.contains(i)) {
				count *= yoko;
				tate++;
			} else if (b.contains(i)) {
				count *= tate;
				yoko++;
			} else {
				count *= tate * yoko - used;
			}
			count %= mod;
			used++;
		}
		System.out.println(count);
	}
}