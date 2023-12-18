import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt() - i - 1;
		}
		quick_sort(0, n - 1, a);
		long sum = 0;
		int b = a[n / 2];
		for(int i = 0; i < n; i++) {
			sum += Math.abs(a[i] - b);
		}
		if(n % 2 == 0 && a[n / 2] != a[n / 2 - 1]) {
			b = a[n / 2 - 1];
			long sum2 = 0;
			for(int i = 0; i < n; i++) {
				sum2 += Math.abs(a[i] - b);
			}
			if(sum > sum2)sum2 = sum;
		}
		System.out.println(sum);
	}
	static void quick_sort(int left, int right, int a[]) {
		if(left >= right) return;
		int pivot = a[left], mid, lower, work;
		for(lower = left, mid = right; lower <= mid;) {
			while(lower <= mid && pivot >= a[lower])
				lower++;
			while(lower <= mid && pivot < a[mid])
				mid--;
			if(lower < mid) {
				work = a[lower];
				a[lower] = a[mid];
				a[mid] = work;
			}
		}
		work = a[left];
		a[left] = a[mid];
		a[mid] = work;
		quick_sort(left, mid - 1, a);
		quick_sort(mid + 1, right, a);
	}
	
}