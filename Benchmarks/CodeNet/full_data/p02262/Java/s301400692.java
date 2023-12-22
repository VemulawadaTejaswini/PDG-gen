import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int data[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			data[i] = scan.nextInt();
		}
		scan.close();
		
		ShellSort(data, n);
		
	}
	
	public static void InsertionSort(int[] A, int n, int[] g) {
		
		int cnt = 0;
		
		for ( int i = 0; i < g.length; i++) {
			for (int j = g[i]; j < n; j++) {
				int v = A[j];
				int k = j - g[i];
				
				
				while ( k >= 0 && A[k] > v) {
					A[k + g[i]] = A[k];
					k -= g[i];
					cnt++;
				}
				A[k + g[i]] = v;
			}
		}
		
		System.out.println(cnt);
		
		for (int i = 0; i < n; i++) {
			System.out.println(A[i]);
		}
	}
	
	public static void ShellSort(int A[], int n) {
		int m = 0;
		int mm = 0;
		int leng = A.length;
		
		for ( int g = leng / 2; g > 0; g /= 2) {
			m++;
		}
		if (m < 1) m = 1;
		int[] G = new int[m];
		System.out.println(m);
		for ( int g = leng / 2; g > 0; g /= 2) {
			G[mm] = g;
			if (m == 1) G[mm] = 1;
			if (mm != m - 1) {
				System.out.print(G[mm] + " ");
			} else {
				System.out.println(G[mm]);
			}
			mm++;
		}
		
		InsertionSort (A, n, G);

	}
}
