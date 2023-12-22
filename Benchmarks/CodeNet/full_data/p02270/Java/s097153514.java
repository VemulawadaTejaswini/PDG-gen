import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int left = 0;
		int right = Integer.MAX_VALUE;
		while (right - left > 1) {
		    int m = (left + right) / 2;
		    int idx = 0;
		    int count = 1;
		    int current = 0;
		    boolean enable = true;
		    while (idx < n) {
		        if (current + arr[idx] > m) {
		            current = 0;
		            count++;
		            if (count > k) {
		                enable = false;
		                break;
		            }
		        } else {
		            current += arr[idx];
		            idx++;
		        }
		    }
		    if (enable) {
		        right = m;
		    } else {
		        left = m;
		    }
		}
		System.out.println(right);
	}
}

