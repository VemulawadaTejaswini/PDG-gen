import java.util.Scanner;


public class Main {
    public static void main(String[] args) { 
    	Scanner scan = new Scanner(System.in);
        int inputs = scan.nextInt();
        boolean[] isPrime = new boolean[inputs+1];
        for (int i = 2; i <= inputs; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= inputs; i++) {
            if (isPrime[i]) {
                for (int j = i+i; j <= inputs; j = j + i) {
                    isPrime[j] = false;
                   // System.out.println(j);
                }
            }
        }
        int primes = 0;
        for (int i = 2; i <= inputs; i++) {
            if (isPrime[i]) 
            	primes++;
        }
        System.out.println(primes);
    }
}