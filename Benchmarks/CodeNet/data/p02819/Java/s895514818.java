import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int X;
    private static boolean isPrime[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();

        createPrimeArray();
        
        System.out.println(getNextPrime(X));
    }
    
    private static void createPrimeArray(){
        
        isPrime = new boolean[2*X+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i = 2; i<isPrime.length; i++) {
            if(!isPrime[i]) {
                continue;
            }
            
            for(int j=2;j*i < isPrime.length; j++) {
                isPrime[j*i] = false;
            }
        }
    }
    
    private static int getNextPrime(int x) {
        
        for(int i=x;i<isPrime.length; i++) {
            if(isPrime[i]) {
                return i;
            }
        }
        
        return -1;
    }

}
