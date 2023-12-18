import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] p = new int[100000];
		p[2] = 1;
		p[3] = 1;
		for (int i = 5; i < 100000; i += 2) {
			p[i] = 1;
			for (int j = 3; j < i; j += 2)
				if (i % j == 0)
					p[i] = 0;
		}
		int q = Integer.parseInt(sc.next());
		int[] ans = new int[q];
		for (int i = 0; i < q; i++) {
			int l = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			for (int j = l; j <= r; j++)
				if (p[j] == 1 && p[(j + 1) / 2] == 1)
					ans[i]++;
		}
		for (int i = 0; i < q; i++)
			System.out.println(ans[i]);
	}
}