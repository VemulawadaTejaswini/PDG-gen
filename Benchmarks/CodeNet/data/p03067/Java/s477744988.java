import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean ans = false;
        
        if ((a < c && c < b) || (a > c && c > b)) {ans = true;}
        
        System.out.println(ans?"Yes":"No");
    }
}
