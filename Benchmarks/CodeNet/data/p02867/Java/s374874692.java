import java.util.*;

public class Main {
	static final int r = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans[] = { "Yes", "No" };
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		for (int i = 0; i < n; ++i)
			b[i] = sc.nextInt();
		Arrays.sort(b);
		sc.close();
		int an = 0;
		for (int i = 0; i < n; ++i) {
			if (b[i] < a[i])
				an = 1;
		}
		System.out.println(ans[an]);

	}
}
