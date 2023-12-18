
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		Combination com = new Combination();
		long n=sc.nextLong();
		int a=sc.nextInt(), b=sc.nextInt();
		int mod = (int)Math.pow(10, 9) +7;
		long ans = com.pow(2, n, mod)-1;
		ans -= com.nCk(n, a, mod);
		ans -= com.nCk(n, b, mod);
		while(ans<0) {
			ans += mod;
		}
		if(n==2) {
			System.out.println(0);
		}else {
			System.out.println(ans);	
		}
		
	}
	
	
}

class Combination {
	public long nCk(long n,long k,int M) {
        long ret = 1;
        long min = Math.min(k, n-k);
        for(long i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        for(int i=1;i<=min;i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        return ret;
    }

	public long pow(long a,long b,int M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }
}