import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		    max = Math.max(max, arr[i]);
		}
		int[] ans = new int[n];
		countingSort(arr, ans, max);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    if (i > 0) {
		        sb.append(" ");
		    }
		    sb.append(ans[i]);
		}
		System.out.println(sb);
	}
	
	static void countingSort(int[] arr, int[] ans, int k) {
	    int[] counts = new int[k + 1];
	    for (int x : arr) {
	        counts[x]++;
	    }
	    for (int i = 1; i <= k; i++) {
	        counts[i] += counts[i - 1];
	    }
	    for (int i = arr.length - 1; i >= 0; i--) {
	        ans[counts[arr[i]] - 1] = arr[i];
	        counts[arr[i]]--;
	    }
	}
}

