import java.util.*;
import java.io.*;

class Counter<T> extends HashMap<T,Integer>{
    public Counter(){
        super();
    }
    public Integer get(Object elm){
        return getOrDefault(elm,0);
    }
    public void add(T elm){
        put(elm, get(elm)+1);
    }
}

public class Main {
static final int MOD = 1_000_000_007;
    public static long addMod(long a, long b){
    	long tmp = (a+b)%MOD;
    	return tmp>=0 ? tmp : tmp+MOD;
    }
    public static long subMod(long a, long b){
    	return addMod(a,-b);
    }
    public static long multMod(long a, long b){
    	long tmp = (a*b)%MOD;
    	return tmp>=0 ? tmp : tmp+MOD;
    }
    public static long powerMod(long a, long x){ //calculate a^x
        if(x<0)return 0;
        if(x==0)return 1;
        if(x%2==0) {
        	long half = powerMod(a,x/2);
        	return multMod(half,half);
        }
        return (a*powerMod(a,x-1)) % MOD;
    }
    public static long inverseMod(long a){
        return powerMod(a,MOD-2);
    }
    public static long divMod(long a, long b){
    	return multMod(a, inverseMod(b));
    }
    public static long[] makeFactorialArray(int size){
        long[] array = new long[size];
        array[0]=1;
        for(int i=1;i<size;i++){
        	array[i]=multMod(array[i-1],i);
        }
        return array;
    }
    public static long[] makeInversedArray(long[] original){
        long[] array = new long[original.length];
        for(int i=0;i<original.length;i++){
        	array[i] = inverseMod(original[i]);
        }
        return array;
    }
    public static long combination(int n, int r, long[] fact, long[] factInv){
        return multMod(fact[n], multMod(factInv[r],factInv[n-r]));
    }
    public static long solve(int N, long M, long[] fact, long[] factInv){
        Counter<Integer> primes = new Counter<>();
        for(int i=2;i<=M;i++){
        	while(M%i==0){
        	    M = M/i;
        	    primes.add(i);
        	}
        }
        //System.out.println(primes);
        
        long ans = 1;
        for(int p:primes.keySet()){
        	int x = primes.get(p);
        	ans = multMod(ans, combination(N-1+x,x, fact,factInv));
        }
        return ans;
    }
    
    public static void main(String[] args) {
        long[] fact = makeFactorialArray(200001);
        long[] factInv = makeInversedArray(fact);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        
        //System.out.println(divisors);
        System.out.println(solve(N,M,fact,factInv));
        
        
    }
}
