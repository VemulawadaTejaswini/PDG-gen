import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        long[] A = new long[N];
        for (int i = 0; i < N ;i++) {
            A[i] = sc.nextLong();
            if (A[i] == 0) {
                System.out.println(0);
                return;
            }
        }
        
        long ans = 1;
        for (int i = 0; i < N ;i++) {
            ans *= A[i];
            if ( ans > 1000000000000000000L) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(ans);
    }
}