import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		int mod = 1000000007;
		List<Integer> list = new ArrayList<>();
		for(int i=2;i*i<=m;i++) {
			int count = 0;
			while(m%i==0) {
				m /= i;
				count++;
			}
			if(count!=0) {
				list.add(count);
			}
		}
		if(m>1) list.add(1);
		long ans = 1;
		for(int q : list) {
			ans = (ans * comb(n+q-1,q,mod)) % mod;
		}
		System.out.println(ans);
		

	}
	
	//return pCq % r
	public static long comb(int p,int q,int mod) {
		long ans = 1;
		for(int i=0;i<q;i++) {
			ans = (ans * ((p-i)%mod))%mod;
		}
		for(int i=2;i<=q;i++) {
			ans = (ans * powmod(i,mod-2,mod))%mod;
		}
		return ans;
	}
	
	public static int powmod(int base,int exp,int mod) {
		long ans = 1;
		while(exp>0) {
			if((exp&1)==1) {
				ans = (ans * base) % mod;
			}
			exp = exp>>1;
			base = (int) (((long)base * base) % mod);
		}
		return (int) ans;
	}

}
