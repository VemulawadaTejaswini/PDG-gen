import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int right = 0;
		int base = arr[0];
		long count = 0;
		for (int left = 0; left < n; left++) {
		    while (right < n - 1 && (base & arr[right + 1]) == 0) {
		        right++;
		        base += arr[right];
		    }
		    count += right - left + 1;
		    base -= arr[left];
		}
		System.out.println(count);
    }
}

