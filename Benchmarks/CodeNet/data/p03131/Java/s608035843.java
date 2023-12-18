// When I hit my pocket
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // number of operations
        int A = sc.nextInt(); // exchange A biscuits to 1 yen
        int B = sc.nextInt(); // exchange 1 yen to B biscuits
        long max = 1;

        if (B - A < 3) {
            max += (long) K; 
        } else {
            while (K > 1) {
                while (max < A) {
                    max++;
                    K--;
                }
                if (max >= A) {
                    
                    max = max - A + B;
                    K = K - 2;
                }
            }
        }
        max += K;
        System.out.println(max);
    }
}