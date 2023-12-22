import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 0; i <= n; i++) {
		    arr[i] = sc.nextInt();
		}
		if (n == 0) {
		    if (arr[0] == 1) {
		        System.out.println(1);
		    } else {
		        System.out.println(-1);
		    }
		    return;
		} else {
		    if (arr[0] != 0) {
		        System.out.println(-1);
		        return;
		    }
		}
		long[] sums = new long[n + 1];
		sums[n] = arr[n];
		for (int i = n - 1; i >= 0; i--) {
		    sums[i] = sums[i + 1] + arr[i];
		}
		long total = 0;
		long current = 1;
		for (int i = 0; i < n; i++) {
		    total += current;
		    current -= arr[i];
		    if (current <= 0) {
		        System.out.println(-1);
		        return;
		    }
		    current = Math.min(current * 2, sums[i + 1]);
		}
		if (current != arr[n]) {
		    System.out.println(-1);
		    return;
		}
		total += current;
		System.out.println(total);
	}
}
