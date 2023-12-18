import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int A[] = new int[n];
		int cnt[] = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
			cnt[A[i]]++;
		}

		boolean odd = n%2 == 1;
		cnt[0]++;
		int d;
		if(odd) {
			d=0;
		} else {
			d=1;
		}
		for(int i=0; i<n; i++) {
			if(odd){
				if(i%2==d) {
					if(cnt[i] != 2) {
						System.out.println(0);
						sc.close();
						return;
					}
				} else {
					if(cnt[i] != 0) {
						System.out.println(0);
						sc.close();
						return;
					}
				}
			}
		}
		ModInt ans = new ModInt(2);
		ans = ans.pow(n/2);
		System.out.println(ans.x);
		sc.close();
	}
}
class ModInt {

	 final static int MOD = 1000000007;
	 public long x;
	 ModInt(long x){
		 this.x = (x % MOD + MOD) % MOD;
	 }
	 public ModInt plus(final ModInt a) {
		 ModInt res = new ModInt(this.x);
		 if((res.x += a.x) >= MOD) {
			 res.x -= MOD;
		 }
		 return res;
	 }
	 public ModInt minus(final ModInt a) {
		 ModInt res = new ModInt(this.x);
		 if((res.x += MOD-a.x) >= MOD) {
			 res.x -= MOD;
		 }
		 return res;
	 }
	 public ModInt mul(final ModInt a) {
		 ModInt res = new ModInt(this.x);
		 res.x *= a.x;
		 res.x %= MOD;
		 return res;
	 }
	 public ModInt pow(long t) {
		 if(t == 0) {
			 return new ModInt(1);
		 }
		 ModInt a = pow(t>>1);
		 a = a.mul(a);
		 if((t&1)==1) {
			 a = a.mul(this);
		 }
		 return a;
	 }
	 public ModInt inv() {
		 ModInt res = pow(MOD-2);
		 return res;
	 }
	 public ModInt div(ModInt a) {
		 ModInt inv = a.inv();
		 return mul(inv);
	 }

}