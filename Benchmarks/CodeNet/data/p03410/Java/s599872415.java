import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < N; i++) {
			b[i] = s.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				ans ^= a[i] + b[j];
			}
		}
		System.out.println(ans);
	}
}
