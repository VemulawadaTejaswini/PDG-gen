import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] a = new int [100];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		System.out.print(a[0]);
		for (int i = 1; i < N; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
		
		int j = 0;
		int t = 0;
		for (int i = 1; i < N; i++) {
			t = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > t) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
			
			System.out.print(a[0]);
			for (int k = 1; k < N; k++) {
				System.out.print(" " + a[k]);
			}
			System.out.println();
		}
	}
}


