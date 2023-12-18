import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] data = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			data[i] = a[i] - i;
		}
		insertion_sort(data, n + 1);
		int b = data[n / 2 + 1];
		long sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += Math.abs(a[i] - (b + i));
		}
		System.out.println(sum);
		
	}
	static void insertion_sort(int[] a, int n) {
		for(int i = 2; i < n; i++) {
			int work = a[i];
			int j = i - 1;
			while(j >= 1 && a[j] > work) {
				a[j + 1] = a[j];
				j--;	
			}
			a[j + 1] = work;
		}
	}
}
