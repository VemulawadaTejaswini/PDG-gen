import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        
        String[] x = stdR.readLine().split(" ");
        int A = Integer.parseInt(x[0]);
        int B = Integer.parseInt(x[1]);
        
        int gcd = GCD(A, B);
        System.out.println(primeFactorization(gcd) + 1);

    }
    
    public static int GCD(int x, int y) {
        if ( y == 0) return x;
        return GCD(y, x % y);
    }
    
    public static int primeFactorization(int n){
        
        int s = (int)(Math.sqrt(n));
        int[] primes = new int[s];
        
        int j = 0;
        for(int i = 2; i <= s; i++){
            
            if(n % i == 0){
                while(n % i  == 0){
                    n /= i;
                }
                primes[j++] = i;                
            }
        }
        
        if(n != 1){
            j++;
        }
        
        return j;
    }
    
}
