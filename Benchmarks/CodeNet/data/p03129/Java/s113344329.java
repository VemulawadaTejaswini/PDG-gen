import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean ans = false;
        int count = 0;
        
        for (int i = 1; i <= n; i += 2) {
            count++;
        }
        if (count >= k) {
            ans = true;
        }
        
        System.out.println(ans?"YES":"NO");
    }

}
