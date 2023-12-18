import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		arr[n] = Integer.MAX_VALUE;
		Arrays.sort(arr); 
		long total = 0;
		int x = 2;
		for (int i = 0; i < n - 2; i++) {
		    for (int j = i + 1; j < n - 1; j++ ) {
		        int left = j;
		        int right = n;
		        while (right - left > 1) {
		            int m = (left + right) / 2;
		            if (arr[i] + arr[j] > arr[m]) {
		                left = m;
		            } else {
		                right = m;
		            }
		        }
		        total += left - j;
		    }
		}
		System.out.println(total);
	}
}
