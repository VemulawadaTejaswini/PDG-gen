import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[] = new int[n];
		for (int i = 0; i < n; ++i)
			p[i] = sc.nextInt();
		sc.close();
		String ans[] = { "YES", "NO" };
		int an = 0;
		int cnt = 0;
		for (int i = 0; i < n; ++i)
			if (p[i] != i + 1)
				++cnt;
		if (cnt / 2 > 1)
			an = 1;
		System.out.println(ans[an]);

	}
}
