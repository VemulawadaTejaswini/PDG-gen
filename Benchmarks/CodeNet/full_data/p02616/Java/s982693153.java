import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		if (arr[n - 1] < 0 && k % 2 == 1) {
		    long ans = 1;
		    for (int i = 0; i < k; i++) {
		        ans *= -arr[n - i - 1];
		        ans %= MOD;
		    }
		    System.out.println(MOD - ans);
		    return;
		}
		int left = 0;
		int right = n - 1;
		long ans = 1;
		if (k % 2 == 1) {
		    ans = arr[n - 1];
		    right--;
		    k--;
		}
		while(k > 0) {
		    long x;
		    if (arr[left] * arr[left + 1] > arr[right] * arr[right - 1]) {
		        if (arr[left] * arr[left + 1] < 0) {
		            x = (MOD + arr[left]) * arr[left + 1] % MOD;
		        } else {
		            x = arr[left] * arr[left + 1] % MOD;
		        }
		        left += 2;
		    } else {
		        if (arr[right] * arr[right - 1] < 0) {
		            x = (MOD + arr[right - 1]) * arr[right] % MOD;
		        } else {
		            x = arr[right] * arr[right - 1] % MOD;
		        }
		        right -= 2;
		    }
		    ans *= x;
		    k -= 2;
		    ans %= MOD;
		}
		System.out.println(ans);
	}
}
