import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int max = (n - 1) * (n - 2) / 2;

		if (max < k) {
			System.out.println(-1);
			return;
		}

		int m = (n - 1) + (max - k);
		System.out.println(m);
		for (int i = 0; i < n - 1; i++) {
			System.out.print(1);
			System.out.print(" ");
			System.out.println(i + 2);
		}

		int i = 0;
		int s = 1;
		int t = 2;
		while (i < max - k) {
			System.out.print(s);
			System.out.print(" ");
			System.out.println(t);
			i++;
			t++;
			if (t >= n) {
				s++;
				t = s + 1;
			}
		}
	}
}
