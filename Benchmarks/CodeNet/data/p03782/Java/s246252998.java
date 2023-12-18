import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		Main main = new Main();
		main.solveD();
	}

	private void solveD() throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int left = 0;
		int right = N;
		while (left < right) {
			int current = (left + right) / 2;
			if (judge(current, a, K)) {
				left = current + 1;
			} else {
				right = current;
			}
		}
		System.out.println(left);
	}

	private boolean judge(int current, int[] a, int K) {
		Set<Integer> set = new HashSet<>();
		set.add(0);
		for (int i = 0; i < a.length; i++) {
			if (current == i) {
				continue;
			}
			Set<Integer> newSet = new HashSet<>(set);
			for (int num : set) {
				if (num + a[i] < K) {
					if (num + a[i] >= K - a[current]) {
						return false;
					}
					newSet.add(num + a[i]);
				}
			}
			set = newSet;
		}
		return true;
	}
}