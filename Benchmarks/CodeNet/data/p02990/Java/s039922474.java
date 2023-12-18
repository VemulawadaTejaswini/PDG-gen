import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long CONST = 1000000007;

		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(n-k+1);
		FermatCombination fc = new FermatCombination(Math.max(n-k+1, k-1), CONST);
		for (int i = 2; i <= k; i++) {
			if(n-k < i-1) {
				System.out.println(0);
			}else {
				long temp1 = fc.combine(n-k+1, i);
				long temp2 = fc.combine(k-1, i-1);
				System.out.println(temp1 * temp2);
			}
		}
	}

}
class FermatCombination {
	
	long factrial[]; //階乗を保持
	long inverse[];  //逆元を保持
	long MOD;
	
	FermatCombination(int size, long mod) {
		
		this.factrial = new long[size + 1];
		this.inverse = new long[size + 1];
		this.MOD = mod;
		
		this.factrial[0] = 1;
		this.inverse[0] = 1;
		
		for (int i = 1; i <= size; i++) {
			factrial[i] = (factrial[i - 1] * i) % MOD;  //階乗を求める
			inverse[i] = pow(factrial[i], (int) MOD - 2) % MOD; // フェルマーの小定理で逆元を求める
		}
	}
	
	long combine(int n, int k) {
		return factrial[n] * inverse[k] % MOD * inverse[n - k] % MOD;
	}
	
	long pow(long x, int n) { //x^n 計算量O(logn)
		long ans = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				ans = ans * x % MOD;
			}
			x = x * x % MOD; //一周する度にx, x^2, x^4, x^8となる
			n >>= 1; //桁をずらす n = n >> 1
		}
		return ans;
	}
}
