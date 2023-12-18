import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static class Pair {
		long a, b;
		Pair(long a, long b) {
			this.a = a;
			this.b = b;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		Pair[] p = new Pair[(int)n];
		for(int i = 0 ; i < n ; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			p[i] = new Pair(a, b);
		}
		Arrays.sort(p, new Comparator<Pair>() {
			public int compare(Pair p1, Pair p2) {
				return (int)(p1.a - p2.a);
			}
		});
		for(int i = 0 ; i < p.length ; i++) {
			k -= p[i].b;
			if(k <= 0) {
				System.out.println(p[i].a);
				return;
			}
		}
	}
}
