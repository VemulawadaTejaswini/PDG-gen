
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int num = partition(a, 0, n - 1);
		printArray(a, n, num);

	}

	public static int partition(int a[], int p, int r) {
		int j;
		int x = a[r];
		int i = p - 1;
		for (j = p; j < r; j++) {
			if (a[j] <= x) {
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i + 1, r);
		return i + 1;
	}

	public static void printArray(int a[], int n, int num) {
		for (int i = 0; i < n - 1; i++) {
			if (i == num) {
				System.out.print("[" + a[i] + "] ");
			} else {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println(a[n - 1]);
	}

	public static void swap(int array[], int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
}

