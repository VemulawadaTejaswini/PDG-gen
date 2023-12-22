import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            int n =scanner.nextInt();
            int result = 0;
            boolean[] prime = new boolean[n+1];
            
            for (int i = 2; i < n+1; i++) {
                prime[i] = true;
            }
            
            for (int i = 2; i < n+1; i++) {
                if (prime[i]) {
                    result++;
                    for (int j = i+i; j < n+1; j += i) {
                        prime[j] = false;
                    }
                }
            }
            System.out.println(result);
        }
    }
}