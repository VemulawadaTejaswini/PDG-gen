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
		int s=0;
		if(n%2==0) {
			s=1;
		}
		boolean ok=true;
		for(int i=0; i<(n+1)/2; i++) {

			int j=2*i+s;
			int d=2;
			if(j==0) {
				d=1;
			}
			if(cnt[j] != d) {
				ok=false;
				break;
			}
		}
		long ans = 0;
		if(!ok) {
			ans=0;
		} else {
			ans = new ModInt(2).pow(n/2).x;
		}

		System.out.println(ans);
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