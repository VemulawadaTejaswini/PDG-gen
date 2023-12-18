import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		long m, mod = 998244353L;
		n = sc.nextInt();
		m = sc.nextLong();
		k = sc.nextInt();
		long[] arr = new long[k+1];
		arr[k] = m;
		for(int i = 2; i <= n; i++){
			for(int j = 0; j < k; j++){
				arr[j] = arr[j]*(m-1) + arr[j+1];
				if(arr[j] > mod)arr[j] %= mod;
			}
			arr[k] = arr[k]*(m-1);
			if(arr[k] > mod)arr[k] %= mod;
		}
		long ret = 0;
		for(int i = 0; i <= k; i++){
			ret += arr[i];
		}
		System.out.println(ret%mod);
	}
}
