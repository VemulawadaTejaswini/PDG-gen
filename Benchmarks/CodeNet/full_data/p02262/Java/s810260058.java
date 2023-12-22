import java.util.Scanner;


public class Main {
	public static int count;
	public static int m;
	public static int[] G = new int[3];
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = stdIn.nextInt();
		
		shellSort(a, n);
		
		System.out.println(m);
		System.out.print(G[0]);
		for (int i = 1; i < m; i++)
			System.out.print(" " + G[i]);
		System.out.println();
		System.out.println(count);
		for (int i = 0; i < n; i++)
			System.out.println(a[i]);
	}
	
	public static void insertionSort(int[] a, int n, int g) {
		for (int i = g; i < n; i++) {
			int v = a[i];
			int j = i - g;
			while (j >= 0 && a[j] > v) {
				a[j+g] = a[j];
				j -= g;
				count++;
			}
			a[j+g] = v;
		}
	}
	
	public static void shellSort(int[] a, int n) {
		
		count = 0;
		if (n > 4) {
			m = 2;
			G[0] = 4;
			G[1] = 1;
			G[2] = -1;
		}
		else {
			m = 1;
			G[0] = 1;
			G[1] = -1;
			
		}
		for (int i = 0; G[i] != -1; i++)
			insertionSort(a, n, G[i]);

	}
}