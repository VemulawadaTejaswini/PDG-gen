import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			long n = scan.nextInt();
			long a = scan.nextInt();
			long b = scan.nextInt();
			long goukei = 0;
			goukei+=mod_pow(2,n,mod);
			goukei-=1;
			long A = 1;
			long B = 1;
			long x =1;
			long y = 1;
			
			for(long i = 0;i<a;i++) {
				
				x=x*(n-i)%mod;
				y=y*(a-i)%mod;
				//System.out.println(x);
				//System.out.println(y);
				
				
			}
			A = (x*mod_pow(y,mod-2,mod))%mod;
			
			x=1;
			y=1;
			
			for(long i = 0;i<b;i++) {
				
				x=x*(n-i)%mod;
				y=y*(b-i)%mod;
				
			}
			B = (x*mod_pow(y,mod-2,mod))%mod;
			
			//System.out.println(x);
			//System.out.println(y);
			goukei-=A;
			goukei-=B;
			
			//System.out.println(A);
			//System.out.println(B);
			System.out.println(goukei+mod);
		}
		
		
	}
	
	private static long mod_pow(long x, long n ,long mod) {//Xのn乗を二分累乗法(繰り返し２乗法)で計算modもあり大きくしない
		long res = 1;
		    while(n > 0){
		        if((n&1)==1) {
		        	res = res*x%mod;
		        }
		        x = x*x%mod;
		        n >>= 1;
		    }
		    return res;
	}
	
	//組み合わせを使う際は、限界まで自力でできるか考えてから使う、ex nC2を求める場合自力でできる
	
	
	 /* int n = 1_000_000; //n=100万まで求めるとする
    pre_factorials(n); //1!からn!までの値を持った配列を準備する    
    System.out.println(fastFermatComb(5, 2)); //5C2を計算 -> 出力10
    System.out.println(fastFermatComb(50000, 3000)); //50000C3000を計算 -> 出力890850597 (1e9+7で割った余り)
	
	*mainメソッドはこのように使うことでコンビネーション使える　mod指定されてるので問題によってかえる
	*/
	
	
	
	 //Fast Fermat Combination
    static int mod = (int) 1e9 + 7;
    static long factorials[]; //事前に階乗計算の結果を格納しておく配列

    static void pre_factorials(int n) { //0!〜n!まで求めておく
        factorials = new long[n + 1];
        factorials[0] = 1;
        for (int i = 0; i < n; i++) {
            factorials[i + 1] = (long)(i + 1) * factorials[i] % mod;
        }
    }

    static long fastFermatComb(long a, long b) {
        if (factorials.length == 0)
            System.err.println("error : factorials has not been culculated!! do [pre_factorials] method");
        long af = factorials[(int) a];
        long bf = factorials[(int) b];
        long abf = factorials[(int) (a - b)];
        long res = af * modpow(bf, mod - 2) % mod * modpow(abf, mod - 2) % mod;
        return res;
    }

    //mod条件下の高速pow
    static long modpow(long a, long p) {
        if (p == 0)
            return 1;
        if (p % 2 == 0) {
            long root = modpow(a, p / 2);
            return root * root % mod;
        } else
            return a * modpow(a, p - 1) % mod;
    }
  
  
  
  
  
}
	
	
	
	