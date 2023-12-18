import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        long power = 1;
        
        for (int i = 1; i <= n; i++) {
            power *= i;
            power %= 1000000007;
        }
        
        ans = (int) power;
        
        System.out.println(ans);
    }
}

