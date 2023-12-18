import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextInt();
		long[] arr = new long[n];
		long tot = 0;
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
			tot += arr[i];
		}
		long max = 0;
		for(long d = 1; d*d <= tot; d++){
			if(tot % d == 0){
				if(check(arr, n, d, k)){
					max = Long.max(max, d);
				}
				if(check(arr, n, tot/d, k)){
					max = Long.max(max, tot/d);
				}
			}
		}
		System.out.println(max);
	}
	static boolean check(long[] arr, int n, long d, long k){
		long[] newarr = new long[n];
		for(int i = 0; i < n; i++){
			newarr[i] = arr[i] % d;
		}
		Arrays.sort(newarr);
		int a = 0, b = n-1;
		while(a < n && newarr[a] == 0) a++;
		long c = 0;
		while(b > a){
			c += newarr[a];
			k -= newarr[a];
			while(newarr[b] + c >= d && b > a){
				c -= (d - newarr[b]);
				b--;
			}
			a++;
		}
		return k >= 0;
	}

}
