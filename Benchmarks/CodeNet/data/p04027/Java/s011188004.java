import java.util.*;

public class Main {
	static long pow(int a, int n, int mod) {
		if(n == 0) return 1;
		
		long m = pow(a, n/2, mod);
		if(n%2 == 0) return (m*m)%mod;
		else return (((m*m)%mod)*a)%mod;
	}
	
	static ArrayList<ArrayList<Integer>> comb(int n, int k) {
		ArrayList<ArrayList<Integer>> lst = new ArrayList<ArrayList<Integer>>();
		if(n == 1) {
			ArrayList<Integer> elem = new ArrayList<Integer>();
			elem.add(k);
			lst.add(elem);
			return lst;
		} else {
			for(int i = 0; i <= k; i++) {
				ArrayList<ArrayList<Integer>> suf = comb(n-1, k-i);
				for(int j = 0; j < suf.size(); j++) {
					ArrayList<Integer> elem = new ArrayList<Integer>();
					elem.add(i);
					for(int l = 0; l < n-1; l++) {
						elem.add(suf.get(j).get(l));
					}
					lst.add(elem);
				}
			}
			return lst;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
			if(a[i] != b[i]) {
				System.out.println(0);
				return;
			}
		}
		
		sc.close();
		
		ArrayList<ArrayList<Integer>> combination = comb(n, c);
		
		int MOD = 1000000007;
		int ans = 0;
		for(int i = 0; i < combination.size(); i++) {
			int subans = 1;
			for(int j = 0; j < n; j++) {
				subans *= pow(a[j], combination.get(i).get(j), MOD);
			}
			ans += subans;
			ans %= MOD;
		}
		
		System.out.println(ans);
	}
	
}