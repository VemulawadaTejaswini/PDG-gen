import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        Long a = sn.nextLong();
        Long b = sn.nextLong();
        Long k = sn.nextLong();
        Long ans = k;
        
        if((k / a) > 0) {
            ans -= a;
            a = 0L;
        } else {
            ans -= a;
            a -= k;
        }
        
        if((ans / b) > 0) {
            ans -= b;
            b -= b;
        } else {
            b -= ans;
        }
        
        System.out.print(a + " " + b);
    }
}
