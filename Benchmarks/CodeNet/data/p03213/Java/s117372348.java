import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import library.common.Predef;

public class Main {
    static final PrintStream so = System.out;
    static final Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int n = ni();
        int[] count = new int[n+1];
        for (int i = 2; i <= n; i++) {
            int[] count_i = factoring(i);
            for (int j = 0; j < count_i.length-1; j++) {
                count[j+1] += count_i[j+1];
            }
        }
        Predef.println(count);
        
        // 75 = 5*5*3 = 25*3 = 15*5 = 75
        int count75 = count(count, 74);
        int count24 = count(count, 24);
        int count14 = count(count, 14);
        int count4 = count(count, 4);
        int count2 = count(count, 2);

        long ans = comb(count4, 2) * (count2-2)
                 + count14 * (count4-1)
                 + count24 * (count2-1)
                 + count75;
                
        so.println(ans);
    }
    
    static int count(int[] a, int least) {
        return (int) IntStream.of(a).filter(i -> i >= least).count();
    }
    
    static long comb(int N, int R) {
        long prod1 = LongStream.rangeClosed(N-R+1, N).reduce((i, j) -> i*j).getAsLong();
        long prod2 = LongStream.rangeClosed(    1, R).reduce((i, j) -> i*j).getAsLong();
        return prod1 / prod2;
    }
    
    static int[] factoring(int argn)  {
        int n = argn;
        int[] count = new int[n+1];
        int[] primes = primes(n);
        int idx = 0;
        while (n > 1) {
            int prime = primes[idx];
            if (n % prime == 0) {
                count[prime]++;
                n /= prime;
            } else {
                idx++;
            }
        }
        return count;
    }
    
    static int[] primes(int max) {
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for (int n = 2; n <= Math.sqrt(max); n++) {
            if (!isPrime[n])
                continue;
            
            for (int i = 2; n*i <= max; i++)
                isPrime[n*i] = false;
        }
        
        return IntStream.rangeClosed(2, max)
                        .filter(n -> isPrime[n])
                        .toArray();
    }
    
    static int ni() {
        return sc.nextInt();
    }
}
