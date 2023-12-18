import java.util.*;
import java.io.*;

public class Main {
    /*
    a=b*0+K,b*0+K+1,...,b*0+b-1	(b-K) caution:b*0+K might be 0
      b*1+K,b*1+K+1,...,b*1+b-1
      b*2+K,b*2+K+1,...,b*2+b-1
      ...
      ...
      ..................b*(line-1)+b-1
      few elements left
    */
    public static long ans(long N, long K){
    	long ans=0;
    	for(long b=K+1;b<=N;b++){
    		long line = N/b;
    		ans += (b-K)*line;
    		if(K==0) ans--;
    		for(long a=b*line+K;a<=N;a++) ans++;
    	}
    	return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        System.out.println(ans(N,K));
        
    }
}