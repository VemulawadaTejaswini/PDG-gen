import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		for (int i = 0; i < M; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		sc.close();

		int min = 0;
		int max = 100001;
		for (int i = 0; i < M; i++) {
			min = Math.max(min, L[i]);
			max = Math.min(max, R[i]);
		}
		System.out.println(max - min + 1);
	}
}
