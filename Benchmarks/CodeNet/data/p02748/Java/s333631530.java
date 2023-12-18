import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), m = sc.nextInt();
		int[] a = new int[A], b = new int[B];
		for (int i = 0; i < A; i++) a[i] = Integer.parseInt(sc.next());
		for (int i = 0; i < B; i++) b[i] = Integer.parseInt(sc.next());
		int min = Integer.MAX_VALUE;
		int x, y, c;
		for (int i = 0; i < m; i++) {
			x = Integer.parseInt(sc.next())-1;
			y = Integer.parseInt(sc.next())-1;
			c = Integer.parseInt(sc.next());
			min = Math.min(min, a[x]+b[y]-c);
		}
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		System.out.println(Math.min(min, a[0]+b[0]));
	}
}