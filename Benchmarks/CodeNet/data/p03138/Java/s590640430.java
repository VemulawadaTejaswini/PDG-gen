import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong();
		}
		long[] kbin = new long[40];
		int kdigit = 0;
		while(k>0){
			kbin[kdigit++] = n;
			k /= 2;
		}
		long[] abin = new long[40];
		for(int i=0; i<n; i++){
			int adigit = 0;
			while(a[i]>0){
				if(a[i]%2==1){
					abin[adigit]++;
				}
				adigit++;
				a[i] /= 2;
			}
		}
		for(int i=0; i<40; i++){
			kbin[i] = Math.max(kbin[i]-abin[i], abin[i]);
		}
		long ans = 0;
		for(int i=0; i<40; i++){
			ans += (long)Math.pow(2, i) * kbin[i];
		}
		System.out.println(ans);
	}
}