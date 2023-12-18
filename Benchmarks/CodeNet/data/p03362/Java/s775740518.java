import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Prime prime = new Prime();

        prime.createPrimeList(n);

        StringBuilder stringBuilder = new StringBuilder();
        for (int num : prime.primes){
            stringBuilder.append(num + " ");
        }

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        System.out.println(stringBuilder.toString());
    }

    static class Prime {
        int last;
        List<Integer> primes = new ArrayList<>();

        Prime(){
            primes.add(11);
            last = 11;
        }

        public boolean isPrime(int x) {
            if(x % 5 != 1){
                return false;
            }
            for (int i = 2; i * i <= x; i ++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public void createPrimeList(int x) {
            for (int i = 0; i < x; i++) {
                nextPrime();
             }
        }

        public void nextPrime(){
            int i = last + 2;
            while(true){
                if(isPrime(i)){
                    primes.add(i);
                    last = i;
                    break;
                }
                i += 2;
            }
        }
    }
}