import java.util.*;
import java.lang.*;


public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxrange = -Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            maxrange = Math.max(maxrange, r - min);
            min = Math.min(min, r);
        }
        System.out.println(maxrange);
    }
}
