import java.util.Scanner;


public class Main {
	public static int partition(int[] arr, int p, int r) {
		int x = arr[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (arr[j] <= x) {
				int a = arr[++i];
				arr[i] = arr[j];
				arr[j] = a;
			}
		}
		int a = arr[i + 1];
		arr[i + 1] = arr[r];
		arr[r] = a;
		return i + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int index = partition(arr, 0, n - 1);
		for (int i = 0; i < n; i++) {
			if (i == index) {
				System.out.print("[" + arr[i] + "] ");
			} else if (i == n - 1) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
