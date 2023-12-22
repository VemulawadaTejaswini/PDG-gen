import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    private static int[] getSieve(int max) {
        int[] sieve = new int[max + 1];
        sieve[1] = 1;
        
        for (int i = 2; i <= max; i++) {
            if (0 < sieve[i]) {
                continue;
            }
            
            int j = i;
            while (j <= max) {
                sieve[j] = i;
                j += i;
            }
        }
        return sieve;
    }
    
    private static Set<Integer> factorize(int n, int[] sieve) {
        Set<Integer> factors = new HashSet<>();
        
        while (1 < n) {
            int p = sieve[n];
            factors.add(p);
            n /= p;
        }
        
        return factors;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int[] A = new int[N];
        
        int max = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (max < A[i]) {
                max = A[i];
            }
        }
        final int[] sieve = getSieve(max);
        
        Set<Integer> fs0 = factorize(A[0], sieve);
        int count = fs0.size();
        Set<Integer> sum = new HashSet<>(fs0);
        Set<Integer> prod = new HashSet<>(fs0);
        
        for (int i = 1; i < N; i++) {
            Set<Integer> fs = factorize(A[i], sieve);
            count += fs.size();
            sum.addAll(fs);
            prod.retainAll(fs);
        }
        
        if (sum.size() == count) {
            System.out.println("pairwise coprime");
            
        } else if (prod.size() == 0) {
            System.out.println("setwise coprime");
            
        } else {
            System.out.println("not coprime");
        }
    }
}
