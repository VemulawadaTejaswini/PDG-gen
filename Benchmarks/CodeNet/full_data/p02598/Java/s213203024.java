import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int right = 0;
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		    right = Math.max(right, arr[i]);
		}
		int left = 0;
		while (right - left > 1) {
		    int m = (left + right) / 2;
		    if (check(m, k, arr)) {
		        right = m;
		    } else {
		        left = m;
		    }
		}
		System.out.println(right);
	}
	
	static boolean check(int num, int count, int[] arr) {
	    for (int x : arr) {
	        count -= (x + num - 1) / num - 1;
	        if (count < 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
