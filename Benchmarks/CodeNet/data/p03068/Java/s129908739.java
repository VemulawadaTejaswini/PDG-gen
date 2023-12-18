import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        String ans = "";
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(k)) {
                ans += "*";
            } else {
                ans += s.charAt(k);
            }
        }
        
        System.out.println(ans);
    }
}