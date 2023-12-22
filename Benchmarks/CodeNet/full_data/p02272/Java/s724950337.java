import java.util.*;

public class Main {
    static int count = 0;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		mergeSort(arr, 0, n);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    if (i > 0) {
		        sb.append(" ");
		    }
		    sb.append(arr[i]);
		}
		System.out.println(sb);
		System.out.println(count);
	}
	
	static void mergeSort(int[] arr, int left, int right) {
	    if (left + 1 < right) {
	        int mid = (left + right) / 2;
	        mergeSort(arr, left, mid);
	        mergeSort(arr, mid, right);
	        merge(arr, left, mid, right);
	    }
	}
	
	static void merge(int[] arr, int left, int mid, int right) {
	    int n1 = mid - left;
	    int n2 = right - mid;
	    int[] lArr = new int[n1 + 1];
	    int[] rArr = new int[n2 + 1];
	    for (int i = 0; i < n1; i++) {
	        lArr[i] = arr[left + i];
	    }
	    for (int i = 0; i < n2; i++) {
	        rArr[i] = arr[mid + i];
	    }
	    lArr[n1] = Integer.MAX_VALUE;
	    rArr[n2] = Integer.MAX_VALUE;
	    int lIdx = 0;
	    int rIdx = 0;
	    for (int i = left; i < right; i++) {
	        if (lArr[lIdx] <= rArr[rIdx]) {
	            arr[i] = lArr[lIdx];
	            lIdx++;
	        } else {
	            arr[i] = rArr[rIdx];
	            rIdx++;
	        }
	        count++;
	    }
	}
}

