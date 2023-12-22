import java.util.Scanner;

/**
 * @author yousack
 */
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int a = in.nextInt();
            int d = in.nextInt();
            int n = in.nextInt();
            if (n == 0) {
                break;
            } else {
                solve(a, d, n);
            }
        }
    }
    
    public static void solve(int a, int d, int n) {
        int counter = 0;
        for (int i = a; ; i += d) {
            if (isPrime(i)) {
                counter++;
            }

            if (counter == n) {
                System.out.println(i);
                break;
            }
        }
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