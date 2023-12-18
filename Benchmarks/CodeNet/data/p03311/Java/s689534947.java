import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[] a = new long[n];
		long[] b = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
			b[i]=a[i];
		}
		Arrays.sort(b);
		long a1 = 0, a2 = 0;
		for (int i = 0; i < n; i++) {
			a1 += Math.abs(a[i] - (b[n / 2] - n / 2 + i));
		}
		System.out.println(a1);
	}
}