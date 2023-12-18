
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static final long MOD = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long[] a = new long[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextLong();
		}
		

		boolean[] prime = new boolean[1_000_000];
		for (int i=2;i<1_000_000;i++) {
			prime[i]=true;
		}
		
		for (int i=2;i<1000;i++) {
			if (prime[i]) {
				for (int j=2;i*j<1_000_000;j++) {
					prime[i*j]=false;
				}
			}
		}
		
//		System.out.println("test");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i=2;i<1_000_000;i++) {
			if (prime[i]) {
				list.add(i);
			}
		}
		HashMap<Integer, Integer> count = new HashMap<>();
		
//		System.out.println("test2");
		
		for (int i=0;i<n;i++) {
			long j = a[i];
			for (Integer intg : list) {
				int tmp = 0;
				while (j%intg==0) {
					j/=intg;
					tmp++;
				}
				if (!count.containsKey(intg) || count.get(intg)<tmp) {
					count.put(intg, tmp);
				}
			}
		}
//		System.out.println("test3");
		long lcm = 1;
		
		
		for (Integer intg : count.keySet()) {
			int k = count.get(intg);
			lcm=lcm*pow(intg,k,MOD)%MOD;
		}
//		System.out.println(lcm);
		
		long ans = 0;
		for (int i=0;i<n;i++) {
			ans=(ans+div(lcm,a[i],MOD))%MOD;
		}
		System.out.println(ans);
	}
	
	
	static long pow (long x, long y, long mod) {
		if (y==0) {
			return 1;
		} else if (y%2==0) {
			long tmp = pow(x,y/2,mod);
			return tmp*tmp%mod;
		} else {
			long tmp = pow(x,y/2,mod);
			return tmp*tmp%mod*x%mod;
		}
	}
	static long div (long x, long y, long mod) {
		return x*pow(y,mod-2,mod)%mod;
	}
	
	
}


