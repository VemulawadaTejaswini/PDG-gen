import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}
		
		babble_sort(A);
		
		int kn = 1;
		int[] knc = new int[N];
		knc[0] = 1;
		int t = A[0];
		for (int i = 1; i < N; i++) {
			if (t != A[i]) {
				kn++;
				knc[kn-1] = 1;
				t = A[i];
			} else {
				knc[kn-1]++;
			}
		}
		
		int tar = kn - K;
		if (tar <= 0) {
			System.out.println(0);
			return;
		}
		
		babble_sort(knc);
		int sum = 0;
		int i = 0;
		while (tar > 0) {
			if (knc[i] == 0) {
				i++;
				continue;
			}
			sum += knc[i];
			tar--;
			i++;
		}
		
		System.out.println(sum);

	}
	
	public static void babble_sort(int[] a) {
		
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - (i + 1); j++) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		
	}
	
}
