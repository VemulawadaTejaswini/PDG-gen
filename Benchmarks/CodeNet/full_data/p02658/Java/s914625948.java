import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        long ans = 1l;

        for (int i = 0; i < n; i++) {
            long a = scan.nextLong();
            ans *= a;
        }
        
        if (ans > 1000000000000000000l) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }

        
    }
}