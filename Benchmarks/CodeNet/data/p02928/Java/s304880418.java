import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long mod = 1000000007;
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) a[i] = in.nextInt();
		long rev = 0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) rev++;
			}
		}
		long rev2 = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]>a[j]) rev2++;
			}
		}
		long ans = ((rev2 % mod) * ((((long)k * (long)(k-1))/2) % mod));
		ans = (ans + (rev*k)%mod)%mod;
		System.out.println(ans);
		in.close();

	}

}