import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		long K = sc.nextInt();
		long[] x = new long[100001];
		int y = 0;
		
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			long b = sc.nextInt();
			x[a] += b;
		}
		
		for (int i = 0; i < 100000; i++) {
			y += x[i];
			if (y >= K) {
				System.out.println(i);
				break;
			}
		}

		sc.close();
	}
}
