import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/* Comparable<P> で比較可能なオブジェクトにする */
	static class P implements Comparable<P>{
		int x, y;
		P(int x, int y) {
			this.x = x; this.y = y;
		}
		@Override /* Comparable<P> の実装 */
		public int compareTo(P o2) {
			int f = Integer.compare(this.x, o2.x);
			if(f == 0) {
				return Integer.compare(this.y, o2.y);
			}
			return f;
		}
		/* toString() を作ると、println()で文字列化される */
		public String toString() {
			return this.x + " " + this.y;
		}
	}
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			P[] a = new P[n];
			for(int i = 0; i < n; i++) {
				a[i] = new P(sc.nextInt(), sc.nextInt());
			}
			Arrays.sort(a);
			for(int i = 0; i < n; i++) {
				System.out.println(a[i]);
			}
		}
	}
}

