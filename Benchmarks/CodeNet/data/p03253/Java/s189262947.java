import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		final int mod = 1000000007;
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		long m = sc.nextLong();
		HashMap<Long, Integer> map = new HashMap<>();
		if(m <= 1)
			System.out.println(m); //1以下の場合
		for(long i = 2 ; i <= (Math.sqrt(m)) + 1 ; i++) {
			if(m % i != 0)
				continue;
			m /= i;
			map.put(i, map.getOrDefault(i,  0) + 1);
			if(m == 1)
				break;
          i--;
		}
		if(m != 1)
			map.put(m, map.getOrDefault(m,  0) + 1);
		long ans = 1;
		for(Long l : map.keySet()) {
			ans *= nCk(map.get(l) + n - 1, map.get(l).intValue() , mod);
			ans += mod;
			ans %= mod;
		}
		System.out.println(ans);



	}
	public static int nCk(int n,int k,int M) {
        long ret = 1;
        int min = Math.min(k, n-k);
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
	            if((b&1)==1) ret = (ret * tmp) % M;  //2進数によるべき乗の高速計算
	            tmp = (tmp * tmp) % M;
	            b = b>>1;
	        }
	        return ret;
	    }


}

