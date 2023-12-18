import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int L[] = new int[M], R[] = new int[M];
		int min = 99999, max = 0;
		for (int i = 0; i < M; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
			min = Math.min(min, R[i]);
			max = Math.max(max, L[i]);

		}
		System.out.println(min - max + 1);
		sc.close();
	}
}
