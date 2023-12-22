
import java.util.Scanner;

public class Main {
	public static int insertionSort(int[] A, int n, int g) {
		int v;
		int cnt = 0;
		for (int i = g; i < n; i++) {
			v = A[i];
			int j = i - g;
			while (j >= 0 && A[j] > v) {
				A[j + g] = A[j];
				j = j - g;
				cnt++;
			}
			A[j + g] = v;

		}
		return cnt;
	}

	public static int shellSort(int[] A, int n) {
		int cnt = 0;
		int[] G = new int[15];
        int m = 0;
        
        for(int i = 1; i <= n; i = i*3 + 1){
            G[m] = i; 
            m++;
        }
		System.out.println(m);
		for (int i = m-1; i >=0; i--) {
			if (i != 0) {
				System.out.print(G[i] + " ");
			} else {
				System.out.println(G[i]);
			}
		}
		for (int i = m-1; i >=0; i--) {
			cnt = cnt + insertionSort(A, n, G[i]);
		}
		return cnt;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}
		int cnt = shellSort(A, n);
		System.out.println(cnt);
		for (int i = 0; i < n; i++) {
			System.out.println(A[i]);
		}
		scanner.close();
	}
}
