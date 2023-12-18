import java.util.*;
import java.io.*;

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
    
    public static long access(long[] array, int index){
    	if(index<0 || index>=array.length) return 1;
    	else return array[index];
    }
    
    public static long solve(int H, int W, int K){
    	long[][] dp = new long[H+1][W];
    	Arrays.fill(dp[0], 0); dp[0][0]=1;
    	//System.out.println(Arrays.toString(dp[0]));
    	
    	long[] simpleBar = new long[]{1,2,3,5,8,13,21,34,55};
    	
    	for(int h=1;h<=H;h++){
    		for(int w=0;w<W;w++){
    			dp[h][w] += multMod(dp[h-1][w], multMod(access(simpleBar,w-1), access(simpleBar,W-w-2)));
    			dp[h][w] %= MOD;
    			if(w>0) {
    				dp[h][w-1] += multMod(dp[h-1][w], multMod(access(simpleBar,w-2), access(simpleBar,W-w-2)));
    			    dp[h][w-1] %= MOD;
    			}
    			if(w<W-1){
    			    dp[h][w+1] += multMod(dp[h-1][w], multMod(access(simpleBar,w-1), access(simpleBar,W-w-3)));
    			    dp[h][w] %= MOD;	
    			} 
    		}
    		//System.out.println(Arrays.toString(dp[h]));
    	}
    	return dp[H][K];
    }
    
    public static void main(String[] args) {
    	long[] fact = makeFactorialArray(200001);
        long[] factInv = makeInversedArray(fact);
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt()-1;
        System.out.println(solve(H,W,K));
        
    }
}