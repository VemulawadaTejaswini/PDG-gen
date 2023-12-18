import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int[] a = new int[N];
			
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		final boolean[] used = new boolean[N];
		int count = 0;
		while (true) {
			if (check(N, a, used)) {
				break;
			}
			count++;
		}
		
		System.out.println(count);
	}

	private static boolean check(int N, int[] a, boolean[] used) {
		boolean anyop = false;
		int current = -1;
		for (int i = N - 1; i >= 0; i--) {
			if (used[i]) {
				continue;
			}
			
			if (current < 0) {
				anyop = true;
				current = a[i];
				used[i] = true;
				continue;
			}
			
			if (a[i] < current) {
				current = a[i];
				used[i] = true;
				continue;
			}
		}
		
		return !anyop;
	}
	
}