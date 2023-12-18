import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		
		// 計算
		long result = 0;
		int MOD = 1000000007; 
		Prime p = new Prime(1000000);
		HashMap<Integer, Integer> lcmMap = p.lcmMap(a);
		//System.out.println(lcmMap.toString());
		long lcm = 1;
		for(Integer key : lcmMap.keySet()){
		    lcm *= pow(key, lcmMap.get(key), MOD);
		    lcm %= MOD;
		}
		
		for(int i = 0; i < n; i++){
		    result += lcm*inv(a[i], MOD);
		    result %= MOD;
		}
		
		// 出力
		System.out.println(result);
	}

	public static long pow(long a, long n, long MOD) {
	    long res=1;
	    while (n>0) {
	        if ((n-n/2*2)==1) {
	            res=(res*a)%MOD;
	        }
	        a=(a*a)%MOD;
	        n>>=1;
	    }
	    return res%MOD;
	}

	public static long inv(long a, long MOD) {
	    return pow(a, MOD - 2, MOD);
	}
	
}

class Prime {
    int n;
    ArrayList<Integer> primes;
    int[] seive;
    
    public Prime(int n){
        this.n = n;
        int[] seive = new int[n+1];
        Arrays.fill(seive, -1);
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++){
            if(seive[i] != -1) continue;
            primes.add(i);
            seive[i] = i;
            for(long j = (long)i*i; j <= n; j += i){
                if(seive[(int)j] == -1) seive[(int)j] = i; 
            }
        }
        this.seive = seive;
        this.primes = primes;
    }
    
    public boolean isPrime(int x){
        return seive[x] == x;
    }
    
    public HashMap<Integer, Integer> factorization(int x){
        HashMap<Integer, Integer> factorization = new HashMap<Integer, Integer>();
        ArrayList<Integer> factorList = factorList(x);
        if(factorList.size() == 0) return factorization;
        for(Integer i : factorList){
            int cnt = factorization.getOrDefault(i, 0);
            factorization.put(i, cnt + 1);
        }
        return factorization;
    }
    
    private ArrayList<Integer> factorList(int x){
        ArrayList<Integer> factorList = new ArrayList<Integer>();
        while(x != 1){
            factorList.add(seive[x]);
            x /= seive[x];
        }
        return factorList;
    }
    
    public HashMap<Integer, Integer> lcmMap(int[] array){
        HashMap<Integer, Integer> lcmMap = new HashMap<Integer, Integer>();
		for(int i = 0; i < array.length; i++){
		    HashMap<Integer, Integer> map = factorization(array[i]);
		    for(Integer key : map.keySet()){
		        lcmMap.put(key, max(lcmMap.getOrDefault(key, 0), map.get(key)));
		    }
		}
        return lcmMap;
    }
    
}

