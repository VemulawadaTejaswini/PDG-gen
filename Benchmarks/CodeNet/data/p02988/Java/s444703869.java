import java.util.Scanner;

public class Main {

	public static int min2(int a, int b, int c) {
		int min = Math.min(a, b);
		int min2 = Math.min(b, c);
		int min3 = Math.min(a, c);
		if (min == min2)
			return min3;
		else if (min == min3)
			return min2;
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[] = new int[n];
		for (int i = 0; i < n; ++i)
			p[i] = sc.nextInt();
		sc.close();
		int cnt = 0;
		for (int i = 1; i < n - 1; ++i) {
			int min2 = min2(p[i - 1], p[i], p[i + 1]);
			if (p[i] == min2)
				++cnt;
		}
		System.out.println(cnt);
	}

}
