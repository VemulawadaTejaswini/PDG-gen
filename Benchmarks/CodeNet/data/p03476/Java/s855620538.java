import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int q = sc.nextInt();
		int[] l = new int[q];
		int[] r = new int[q];
		for(int i = 0; i < q; i++){
		    l[i] = sc.nextInt();
		    r[i] = sc.nextInt();
		}
		
		// 計算
		int[] result = new int[100001];
		Prime p = new Prime(100001);
		for(int i = 1; i < result.length; i++){
		    if(i != 2 && p.isPrime(i) && p.isPrime((i+1)/2)){
		        result[i] += result[i-1] + 1;
		    }else{
		        result[i] += result[i-1];
		    }
		}
		
		// 出力
		for(int i = 0; i < q; i++){
		    System.out.println(result[r[i]] - result[l[i]-1]);
		}
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


