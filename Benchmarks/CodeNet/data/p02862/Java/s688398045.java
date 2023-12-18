import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int n = (X+Y)/3;
		int x = X-n;
		int y = Y-n;
		if((X+Y)%3 != 0 || x<0 || y<0) {
			System.out.println(0);
			sc.close();
			return;
		}
		Combination com = new Combination(n);
		ModInt ans = com.combi(n, x);
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
class Combination {
	ModInt[] fact, ifact;
	public Combination(int n){
		assert(n < ModInt.MOD);
		fact = new ModInt[n+1];
		ifact = new ModInt[n+1];
		for(int i=0; i<n+1; i++) {
			fact[i]=new ModInt(0);
			ifact[i]=new ModInt(0);
		}
		fact[0]=new ModInt(1);
		for(int i=1; i<=n; i++) {
			fact[i] = fact[i-1].mul(new ModInt(i));
		}
		ifact[n]=fact[n].inv();
		for(int i=n; i>=1; i--) {
			ifact[i-1] = ifact[i].mul(new ModInt(i));
		}
	}
	public ModInt combi(int n, int k) {
		if(k<0||k>n) return new ModInt(0);
		return fact[n].mul(ifact[k]).mul(ifact[n-k]);
	}
}
