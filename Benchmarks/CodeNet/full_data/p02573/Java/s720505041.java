import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int P = scan.nextInt();
		int[] A = new int[N];
		int[][] mem = new int[N][N];
		int ans = 0;
		int g = 0;
		for (long i = 0; i < P; i++) {
			int a = scan.nextInt() - 1;
			int b = scan.nextInt() - 1;
			if (mem[Math.min(a, b)][Math.max(a, b)] == 0) {
				if (A[a] == A[b] && A[a] == 0) g++;
				if (A[a] != 0 && A[b] != 0) g --;
				A[a]++;
				A[b]++;
				if (A[a] > A[b]) A[b] = A[a];
				if (A[b] > A[a]) A[a] = A[b];
				if (ans < A[a]) ans = A[a];
				if (ans < A[b]) ans = A[b];
				mem[Math.min(a, b)][Math.max(a, b)] = 1;

				if (g < 0) g = 0;
			}
		}
		System.out.println(ans + Math.max(0, g));
	}
}