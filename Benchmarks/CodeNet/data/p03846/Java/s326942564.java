import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int mod = 1000000007;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			int v = sc.nextInt();
			a[v]++;
		}
		if(n%2 != 0 && a[0]!=1) {
			System.out.println(0);
			sc.close();
			return;
		}
		int s;
		if(n%2==0) {
			s=1;
		}else {
			s=2;
		}
		for(int i=s; i<n; i+=2) {
			if(a[i] != 2) {
				System.out.println(0);
				sc.close();
				return;
			}
		}
		//2^(n/2)
		long ans = pow(2, n/2);
		System.out.println(ans);
		sc.close();
	}

	public long  pow(int n, int k) {
		if(k==0) return 1;
		if(k%2 == 0) {
			long tmp = pow(n, k/2);
			long ret = tmp * tmp;
			ret %= mod;
			return ret;
		}else {
			long tmp = pow(n, k-1);
			long ret = tmp * n;
			ret %= mod;
			return ret;

		}
	}
}
