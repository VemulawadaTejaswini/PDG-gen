import java.util.*;

public class Main {
	static int P = (int)1e9+7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] cnt = new int[1000000];
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			a[i] = num;
			
			int d = 2, c = 0;
			while(num>1) {
				if(num%d==0) {
					num/=d;
					c++;
				}
				else {
					cnt[d] = Math.max(cnt[d], c);
					d++;
					c = 0;
				}
			}
			cnt[d] = Math.max(cnt[d], c);
		}
		
		long lcm = 1;
		for(int i=2;i<cnt.length;i++) {
			for(int j=0;j<cnt[i];j++) {
				lcm = (lcm*i) % P;
			}
		}

		long ans = 0;
		for(int i=0;i<n;i++) {
			long ainv = fp(a[i], P-2);
			ans = (ans + (lcm * ainv % P)) % P;
		}
		
		System.out.println(ans);
	}
	static long fp(int a, int p) {
		if(p==0)
			return 1;
		long num = fp(a, p/2);
		if(p % 2 == 0)
			return num * num % P;
		else
			return num * num % P * a % P;
	}
}
