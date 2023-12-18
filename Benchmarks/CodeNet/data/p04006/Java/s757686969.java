import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int x = scanner.nextInt();
		int a[] = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		long time = 0;
		int maxshift = 0;
		a: for (int i = 0; i < a.length; i++) {
			int tem = a[i];
			int num = i;
			for (int j = 1; j < a.length; j++) {
				if (x * j > a[i]) {
					time = time + a[num];
					continue a;
				}
				int tt = a[(i - j + N) % (N - 1)] + j * x;
				if (tem > tt) {
					maxshift = Math.max(maxshift, j);
					tem = tt;
					num = (i - j + N) % (N - 1);
				}
			}
			time = time + a[num];
		}
		time = time + x * maxshift;
		System.out.println(time);
	}

}