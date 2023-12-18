import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			b[i] = a[i] - (i+1);
		}
		Arrays.sort(b);
		int ans = 0;
		for(int i = 0; i < n; i++) {
			ans += Math.abs(a[i] - (b[n/2] + i + 1));
		}
		System.out.println(ans);
	}
}
