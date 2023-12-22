import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        for(int i = 1, n = scn.nextInt(); i <= n; i++) {
            if(call(i)) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
    
    private static boolean call(int x) {
        boolean rslt = false;
        if(x % 3 == 0) {
            rslt = true;
        }
        for(; x > 0; x /= 10) {
            if(x % 10 == 3) {
                rslt = true;
                break;
            }
        }
        return rslt;
    }
}