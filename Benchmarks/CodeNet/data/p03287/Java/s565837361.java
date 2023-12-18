import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m = sc.nextInt(), idx = 1;
		long ans = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			arr[i] %= m;
		}
		int[] amr = new int[n];
		long[] cnt = new long[n];
		amr[0] = arr[0];
		cnt[0] = 1;
		boolean chk = false;
		if(arr[0] == 0)ans++;
		for(int k = 1; k < n; k++) {
			chk = false;
			for(int i = 0; i < idx; i++) {
				amr[i] += arr[k];
				amr[i] %= m;
				if(amr[i] == 0)ans += cnt[i];
				if(amr[i] == arr[k]) {
					cnt[i]++;
					chk = true;
				}
			}
			if(arr[k] == 0)ans++;
			if(!chk) {
				amr[idx] = arr[k];
				cnt[idx] = 1;
				idx++;
			}
		}
		System.out.println(ans);
	}
}
