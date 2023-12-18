import java.util.*;
import java.io.*;

class Counter<T> extends HashMap<T,Long>{
    public Counter(){
        super();
    }
    public Long get(Object elm){
        return getOrDefault(elm,0L);
    }
    public void add(T elm){
        put(elm, (get(elm)+1L)%1_000_000_007);
    }
    public void add(T elm, long num){
        put(elm, (get(elm)+num)%1_000_000_007);
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
    
    public static Counter<Long> combine(Counter<Long> A, Counter<Long>B, long M, LinkedList<Long> divisors){
        Counter<Long> ans = new Counter<>();
        for(long a:divisors)for(long b:divisors){
        	if(a*b>M) break;
        	if(M%(a*b)==0) ans.add(a*b, multMod(A.get(a),B.get(b)));
        }
        return ans;
    }
    public static Counter<Long> base(long M, LinkedList<Long> divisors){//solve for 1
        Counter<Long> ans = new Counter<>();
        for(long d:divisors) ans.add(d);
        //System.out.println("1 "+ans);
        return ans;
    }
    public static Counter<Long> solve(int N, long M, LinkedList<Long> divisors, Counter<Long> base){
        if(N==1){
        	return base;
        }else if(N%2==0){
        	int half = N/2;
        	Counter<Long> single = solve(half,M,divisors,base);
        	Counter<Long> ans = combine(single, single ,M,divisors);
        	System.out.println(N+" "+ans);
        	return ans;
        }else{
        	Counter<Long> ans = combine(solve(N-1,M,divisors,base),base,M,divisors);
        	System.out.println(N+" "+ans);
        	return ans;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        
        LinkedList<Long> divisors = new LinkedList<>();
        int rootM = (int)(Math.floor(Math.sqrt(M)));
        for(long m=rootM;m>0;m--){
        	divisors.addFirst(m);
        	if(m*m!=M)divisors.addLast(M/m);
        }
        
        //System.out.println(divisors);
        System.out.println(solve(N,M,divisors,base(M,divisors)).get(M));
        
        
    }
}
