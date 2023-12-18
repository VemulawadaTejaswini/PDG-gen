import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        long C = Long.parseLong(sc.next());
        long D = Long.parseLong(sc.next());
        long count =  (B/C - A/C) + (B/D - A/D) - (B/(C*D/saiyaku(C,D)) - A/(C*D/saiyaku(C,D))); 
        System.out.println(B-A-count+1);
    }
    
    public static long max(long x, long y) {
        if(x <= y) {
            return y;
        }else {
            return x;
        }
    }
    
    public static long saiyaku(long x, long y) {
        long w = 0;
        if(x < y) {
            w = x;
            x = y;
            y = w;
            return saiyaku(x, y);
        }
        w = y;
        y = x % y;
        x = w;
        if(y == 0) {
            return x;
        }else {
            
            return saiyaku(x, y);
        }
    }
    
    
}