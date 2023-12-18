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
		quick_sort(1, n, data);
		int b = data[n / 2 + 1];
		long sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += Math.abs(a[i] - (b + i));
		}
		System.out.println(sum);
		
	}
	static void quick_sort(int left, int right, int data[]) {
		if(left >= right) return;
		int pivot = data[left], lower, mid, t;
		for(lower = left, mid = right; lower < mid;) {
			while(lower <= mid && data[lower] <= pivot)
				lower++;
			while(lower <= mid && data[mid] > pivot)
				mid--;
			if(lower < mid) {
				t = data[lower];
				data[lower] = data[mid];
				data[mid] = t;
			}
		}
		t = data[left];
		data[left] = data[mid];
		data[mid] = t;
		quick_sort(left, mid - 1, data);
		quick_sort(mid + 1, right, data);
	}
}
