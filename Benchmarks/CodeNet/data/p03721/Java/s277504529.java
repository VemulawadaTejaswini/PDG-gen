import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		Pair[] p = new Pair[n];
		for(int i = 0 ; i < n ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			p[i] = new Pair(a, b);
		}
		Arrays.sort(p, new Comparator<Pair>() {
			public int compare(Pair p1, Pair p2) {
				return p1.a - p2.a;
			}
		});
		for(int i = 0 ; i < n ; i++) {
			k -= p[i].b;
			if(k <= 0) {
				System.out.println(p[i].a);
				return;
			}
		}
	}

	public static class Pair {
		int a, b;
		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

}
