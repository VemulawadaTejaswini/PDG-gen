import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		Arrays.sort(b);
		int ans = 0;
		for(int i = 0; i < n; i++) {
			int ind = binarySearch(b, a[i]);
			if(Math.abs(i - ind) % 2 != 0) {
				ans++;
			}
		}
		System.out.println(ans/2);
	}
	public static int binarySearch(int[] arr, int b) {
		int l = 0;
		int r = arr.length-1;
		while(l <= r) {
			int mid = (l+r)/2;
			if(arr[mid] < b) {
				l = mid+1;
			} else if(arr[mid] > b) {
				r = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
