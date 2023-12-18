import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		Integer[] a = new Integer[n];
		int mod = 1000000000+7;
//		int[] b = new int[n*k];
		
		long count;
		long counta = 0;
		long countb = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					counta++;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]>a[j]) {
					countb++;
				}
			}
		}
		
		long ans = ((countb % mod) * ((((long)k * (long)(k-1))/2) % mod));
		ans = (ans + (counta*k)%mod)%mod;
		System.out.println(ans);
		
//		count = ((counta * k)%mod + countb * (k * (k -1) / 2)%mod)%mod;
//		count %= mod;
//		System.out.println(count);
		
		sc.close();
	}
}