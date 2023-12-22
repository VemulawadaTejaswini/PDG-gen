
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner sc = new Scanner(is);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i= 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        long allGcd = A[0];
        for(int i = 1; i < N; i++) {
            if(allGcd > A[i])
                allGcd = gcd(A[i], allGcd);
            else
                allGcd = gcd(allGcd, A[i]);
        }
        if(allGcd == 1) {
            Set<Integer> primeSet = new HashSet<>();
            for(int i = 0; i < N; i++) {
                Set<Integer> primes = primes(A[i]);
                for(Integer prime : primes) {
                    if(primeSet.contains(prime)){
                        os.println("setwise coprime");
                        return;
                    }
                    primeSet.add(prime);
                }
            }
            os.println("pairwise coprime");
        } else {
            os.println("not coprime");
        }
    }

    static public long gcd(long a, long b) {
        while(a > 0) {
            long tmpa = a;
            a = b % a;
            b = tmpa;
        }
        return b;
    }

    static public Set<Integer> primes(int A) {
        Set<Integer> ret = new HashSet<>();
        if (A % 2 == 0) {
            ret.add(2);
            while (A % 2 == 0) {
                A /= 2;
            }
        }
        for(int i = 3; i <= Math.sqrt(A); i+=2) {
            if (A % i == 0) {
                ret.add(i);
                while (A % i == 0) {
                    A /= i;
                }
            }
        }
        if(A != 1)
            ret.add(A);
        return ret;
    }
}