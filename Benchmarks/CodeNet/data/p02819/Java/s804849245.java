import java.util.ArrayList;
import java.util.Scanner;

// 20
public class Main {
    static int getMorePrime(int n) {
        if(n == 2) return n;

        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        int i = 2;
        while(true) {
            for(int j = 0 ; j < primes.size(); j++)
                if(i % primes.get(j) == 0) {
                    ++i;
                    j = 0;
                }
            if(i >= n) return i;
            primes.add(i);
            ++i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(getMorePrime(n));
    }

}
