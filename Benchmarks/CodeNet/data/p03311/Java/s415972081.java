import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[] a = new long[n];
		for (int i = 0;i < n;i++) {
			a[i] = Integer.parseInt(sc.next()) - i - 1;
		}
		Arrays.sort(a);
		long ans = 0;
		for (int i = 0;i < n;i++) {
			ans += Math.abs(a[i] - a[n / 2]);
		}
		System.out.println(ans);
	}
}