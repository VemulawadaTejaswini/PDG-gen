import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long N = sc.nextLong();
	    long ans = 0;
	    long minsum = 0;
	    if(sosuu(N)) {
	        ans = N - 1;
	    }else if(sosuu(N / 2)) {
            ans = N / 2; 
        }else{
            //i*i < N < (i+1)(i+1)
            int minindex = 0;
            int maxindex = 0;
            for(int i = 2; i <= N; i++) {
                if(N <= Math.pow(i,2)) {;
                    maxindex = i;
                }
            }
	        for(int i = 2; i <= maxindex; i++) {
	            if(N % i != 0) {
	                continue;
	            }
                if(i * N / i == N) {
                    if(minsum == 0) {
                        minsum = i + N/i;
                    }
                    if(i + N / i < minsum) {
                        minsum = i + N/i;
                    }
                }
	        }
	        ans = minsum - 2;
	    }
        
        System.out.println(ans);
	}
	
	static boolean sosuu(long n) {
	    if(n < 2) {
	        return false;
	    }
	    if(n == 2) {
	        return true;
	    }
	    if(n % 2 == 0) {
	        return false;
	    }
	    for(long i = 3; i <= Math.sqrt(n); i += 2) {
	        if(n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

}