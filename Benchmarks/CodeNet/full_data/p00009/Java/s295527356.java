import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            int n =scanner.nextInt();
            int result = 0;

            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
    public static boolean isPrime (int n) {
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}