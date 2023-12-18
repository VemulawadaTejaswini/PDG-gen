import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long prime = 1000000007;

        long total = 1;
        total = modPow(2, n, prime);

        long ax = 1;
        for(int i = 1; i <= a; i++){
            ax = (ax * (n - i + 1)) % prime;
        }
        long ay = 1;
        for(int i = 1; i <= a; i++){
            ay = (ay * i) % prime;
        }
        ay = modPow(ay, prime-2, prime);
        long nCa = (ax * ay) % prime;

        long bx = 1;
        for(int i = 1; i <= b; i++){
            bx = (bx * (n - i + 1)) % prime;
        }
        long by = 1;
        for(int i = 1; i <= b; i++){
            by = (by * i) % prime;
        }
        by = modPow(by, prime-2, prime);
        long nCb = (bx * by) % prime;
        total = (total - nCa - nCb -1) % prime;
        
        System.out.println((total >= 0)?total : total + prime);
        
    }
    
    public static long modPow(long a, long n, long p){
    	long ans = 1;
    	while (n > 0){
    		if((n & 1) == 1){
    			ans = (ans * a) % p;
    		}
			a = (a * a) % p;
			n >>= 1;
    	}
    	return(ans);
    }
}