import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveC();
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int T = sc.nextInt();
		int[] array = new int[N];
		boolean[] isConflictable = new boolean[N];
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt() + T * (3 - sc.nextInt() * 2);
			isConflictable[i] = true;
		}
		boolean isOK = false;
		while (!isOK) {
			boolean[] nextIsConflictable = new boolean[N];
			isOK = true;
			for (int i = 1; i <= N; i++) {
				if (!isConflictable[i - 1]) {
					continue;
				}
				if (checkAndSwap(array, i - 1, i % N, N, L)) {
					isOK = false;
					nextIsConflictable[(i - 2 + N) % N] = true;
					nextIsConflictable[i % N] = true;
				}
			}
			isConflictable = nextIsConflictable;
		}
		for (int x : array) {
			System.out.println((x + L) % L);
		}
	}

	private boolean checkAndSwap(int[] array, int a, int b, int N, int L) {
		int offset = 0;
		if (a == N - 1 && b == 0) {
			offset = L;
		}
		if (array[a] - offset > array[b]) {
			int swap = array[b];
			array[b] = array[a] - offset;
			array[a] = swap + offset;
			return true;
		}
		return false;
	}
}