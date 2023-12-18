import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static class Pair {
		int x, y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] d = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		Pair[] p1 = new Pair[n];
		Pair[] p2 = new Pair[n];
		for(int i = 0 ; i < n ; i++) {
			p1[i] = new Pair(a[i], b[i]);
			p2[i] = new Pair(c[i], d[i]);
		}
		Arrays.sort(p1, new Comparator<Pair>() {
			public int compare(Pair p11, Pair p12) {
				if(p11.x == p12.x) {
					return p11.x - p12.x;
				}
				return p11.y - p12.y;
			}
		});
		Arrays.sort(p2, new Comparator<Pair>() {
			public int compare(Pair p21, Pair p22) {
				if(p21.x == p22.x) {
					return p21.x - p22.x;
				}
				return p21.y - p22.y;
			}
		});
		long ans = 0;
		for(int i = 0 ; i < n ; i++) {
			System.out.println("(" + p1[i].x + ", " + p1[i].y + ")");
		}
		for(int i = 0 ; i < n ; i++) {
			System.out.println("(" + p2[i].x + ", " + p2[i].y + ")");
		}
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(p1[i].x == -1 || p1[j].x == -1) continue;
				if(p1[i].x < p2[j].x && p1[i].y < p2[j].y) {
					ans++;
					p1[i] = new Pair(-1, -1);
					p2[j] = new Pair(-1, -1);
				}
			}
		}
		System.out.println(ans);
	}
}
