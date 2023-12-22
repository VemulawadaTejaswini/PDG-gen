import java.util.Scanner;

/**
 * @author yousack
 */
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            } else {
                solve(n);
            }
        }
    }
    
    public static void solve(int n) {
        int counter = 0;
        for (int i = n + 1; i <= n * 2 ; i++) {
            if (isPrime(i)) {
                counter++;
            }
        }

        System.out.println(counter);
    }
    
    public static boolean isPrime(int n) {
        boolean result = true; 
        
        if (n == 1) {
            result = false;
        }
        
        for (int i = 2; i <= Math.sqrt((double)n); i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        
        return result;
    }
}