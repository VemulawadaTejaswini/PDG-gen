import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x = sc.nextInt();
		int y = sc.nextInt();
		int MOD = 1000000007;
		
		// 計算
		long result = 0;
		if((x + y)%3 != 0){
		    System.out.println(result);
		    return;
		}
		
		result = combination((x+y)/3, (2*x-y)/3, MOD);
		
		// 出力
		System.out.println(result);
	}
	
    public static int combination(int n,int k,int M) {
        long ret = 1;
        int min = min(k, n-k);
        for(int i=1;i<=min;i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        for(int i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        return (int)ret;
    }

    public static long pow(long a,long b,int M) {
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
