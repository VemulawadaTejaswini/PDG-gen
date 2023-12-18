import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
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
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long a[] = new long[n];
		for(int i=0; i<n; i++) a[i] = sc.nextLong();

		ModInt ans = new ModInt(0);
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				ans = ans.plus(new ModInt(a[i] ^ a[j]));
			}
		}
		System.out.println(ans.x);
		sc.close();
	}
}
