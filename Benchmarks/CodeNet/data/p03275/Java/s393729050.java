
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	static long mergeSort(int arr[], int array_size) {
		int temp[] = new int[array_size];
		return _mergeSort(arr, temp, 0, array_size - 1);
	}

	static long _mergeSort(int arr[], int temp[], int left, int right) {
		int mid;
		long inv_count = 0;
		if (right > left) {

			mid = (right + left) / 2;

			inv_count = _mergeSort(arr, temp, left, mid);
			inv_count += _mergeSort(arr, temp, mid + 1, right);

			inv_count += merge(arr, temp, left, mid + 1, right);
		}
		return inv_count;
	}

	static long merge(int arr[], int temp[], int left, int mid, int right) {
		int i, j, k;
		long inv_count = 0;

		i = left; 
		j = mid; 
		k = left; 
		while ((i <= mid - 1) && (j <= right)) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
				inv_count = inv_count + (mid - i);
			}
		}

		while (i <= mid - 1)
			temp[k++] = arr[i++];

		while (j <= right)
			temp[k++] = arr[j++];

		for (i = left; i <= right; i++)
			arr[i] = temp[i];

		return inv_count;
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		int l = 1, r=1000000000;
		while (l<=r) {
			int mid = (l+r)/2;
			if (check(a,mid)) l=mid+1;
			else r=mid-1;
		}
		System.out.println(l);

	}

	private static boolean check(int[] a, int mid) {
		int b[] = new int[a.length+1];
		for (int i=0;i<b.length;i++) {
			if (i==0) {
				b[i] = 0;
				continue;
			}
			else b[i] = b[i-1];
			if (a[i-1]<=mid) b[i]--;
			else b[i]++;
		}
		long num = mergeSort(b,b.length);
		return (num<=(long)(a.length+1)*a.length/4);
	}
}
