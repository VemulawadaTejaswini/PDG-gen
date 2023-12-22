import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	private static final long p = 1000000007;
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();



		int n = N/3;
		long ans = 0;
		for(int i=1;i<=n;i++) {
			int M = N - 3*i;
			ans = (ans + partition(M,i))%p;
		}

		System.out.println(ans);

	}

	public static long partition(long x,long d) {


		return modCombination(x+d-1,d-1,p);

	}
    public static final long modPow(long x, long n, final long mod) {
        long sum = 1;
        while (n > 0) {
            if ((n & 1) == 1) {      //ビットが立っていたら
                sum = sum * x % mod; //x^2^k1 * x^2^k2 * x^2^k3 * ・・・
            }
            x = x * x % mod;         //((x^2)^2)^2 ・・・
            n >>= 1;
        }
        return sum;
    }
    public static final long modCombination(long a, long b, final long mod) {
    	long P = 1;
    	for(long i=a;i>=a-b+1;i--) {
    		P = P*i%mod;
    	}
    	long F = 1;
    	for(long i=1;i<=b;i++) {
    		F = F*i%mod;
    	}

    	long modComb = P*modPow(F,mod-2,mod)%mod;
    	return modComb;
    }

}
