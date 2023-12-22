import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int gcd = 1;
        int mod = Math.max(x, y) % Math.min(x, y);
        
        if (mod == 0){
            gcd = Math.min(x, y);
        } else {
            for (int i = 1; i <= mod; i++) {
                if (x % i == 0 && y % i == 0) {
                    if (gcd < i) {
                        gcd = i;
                    }
                }
            }
        }
        System.out.println(gcd);
    }
}
