import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int ans = 0;
        for(long K: divisor(N)){
            long tmp = N;
            while(K <= tmp){
                if(tmp%K == 0){
                    tmp /= K;
                }else{
                    tmp %= K;
                }
            }
            if(tmp == 1){
                ans++;
            }
        }
        System.out.println(ans);
        
    }
    
    //http://kanetai.hatenablog.com/entry/20110519/1305833341
    public static ArrayList<Long> divisor(long n){
    	ArrayList<Long> ret = new ArrayList<Long>();
    	ret.add(n);
    	ret.add(n-1);
    	long m = (long)Math.pow(n,0.5) +1;
    	for(long i=2; i <= m; i++){
    		if( n % i == 0){
    			ret.add(i);
    			//n=PQ+0→ PもQも約数. ただし、Q=Pは↑で登録済みなので登録しない
    			if( i != n/i ) ret.add(n/i); 
    		}
    	}
    	n = n-1;
    	for(long i=2; i <= m; i++){
    		if( n % i == 0){
    			ret.add(i);
    			//n=PQ+0→ PもQも約数. ただし、Q=Pは↑で登録済みなので登録しない
    			if( i != n/i ) ret.add(n/i); 
    		}
    	}
    	return ret;
    }
}
