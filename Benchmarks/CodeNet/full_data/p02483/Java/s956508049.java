09:52 ?????????????????? import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1;; i++) {
			int x = sc.nextInt();
			if (x == 0) {
				break;
			}
			System.out.printf("Case %d: %d\n", i, x);
		}

	}
}
09:53 ?????????????????? import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max;
		int min;
		int mid;
		if (a <= b && b <= c) {
			max = c;
			min = a;
			mid = b;
		} else if (a <= c && c <= b) {
			max = b;
			mid = c;
			min = a;
		} else if (b <= a && a <= c) {
			max = c;
			min = b;
			mid = a;
		} else if (b <= c && c <= a) {
			max = a;
			min = b;
			mid = c;
		} else if (c <= a && a <= b) {
			max = b;
			min = c;
			mid = a;
		} else {
			max = a;
			min = c;
			mid = b;
		}
		System.out.printf("%d %d %d\n", min, mid, max);
	}
}