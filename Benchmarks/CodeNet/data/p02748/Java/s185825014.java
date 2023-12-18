import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int A = sc.nextInt();
		final int B = sc.nextInt();
		final int M = sc.nextInt();
		
		int[] a = new int[A];
		int[] b = new int[B];
		
		int minA = 100000;
		int minB = 100000;
		
		for (int i = 0; i < A; i++) {
			int p = sc.nextInt();
			if (p < minA)
				minA = p;
			a[i] = p;
		}
		for (int i = 0; i < B; i++) {
			int p = sc.nextInt();
			if (p < minB)
				minB = p;
			b[i] = p;
		}
		
		int min = minA + minB;
		
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			
			int cost = a[x - 1] + b[y - 1] - c;
			if (cost < min)
				min = cost;
		}
		
		System.out.println(min);
		sc.close();
	}
}
