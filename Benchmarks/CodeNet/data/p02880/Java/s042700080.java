import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    
    public static int[] primes(int n) {
        Stream<Integer> candidates =
                IntStream.rangeClosed(2, n).boxed();
        
        int prime = 2;
        double upper = Math.sqrt(n);
        while (prime < upper) {
            int currentPrime = prime;
            candidates = candidates.filter(c -> c % currentPrime != 0);
            prime = candidates.filter(c -> c > currentPrime).findFirst().get();
        }
        
        return candidates.mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        
        int N = sc.nextInt();
        
        if (primes(N).length > 2) System.out.println("Yes");
        else System.out.println("No");
    }
    
}