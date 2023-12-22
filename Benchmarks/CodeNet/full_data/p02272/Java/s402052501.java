import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int merge(int left, int mid, int right, int[] arr) {
		int n1 = mid - left;
		int n2 = right - mid;
		int[] l = new int[n1 + 1];
		for (int i = 0; i < l.length - 1; i++) {
			l[i] = arr[left + i];
		}
		int[] r = new int[n2 + 1];
		for (int i = 0; i < r.length - 1; i++) {
			r[i] = arr[mid + i];
		}
		l[n1] = Integer.MAX_VALUE;
		r[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for (int k = left; k < right; k++) {
			if(l[i] > r[j]) {
				arr[k] = r[j];
				j++;
			} else {
				arr[k] = l[i];
				i++;
			}
		}
		return n1 + n2;
	}
	public static int mergeSort(int left, int right, int[] arr) {
		int count = 0;
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			count += mergeSort(left, mid, arr);
			count += mergeSort(mid, right, arr);
			count += merge(left, mid, right, arr);
		}
		return count;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] str = br.readLine().split(" ");
		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		int count = mergeSort(0, n, arr);
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(count);
	}
}
