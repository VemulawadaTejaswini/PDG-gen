import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        long c = s.nextLong();
        long k = s.nextLong();
        long ans = 0;
        if(k > (a+b)) {
            ans = k-(a+b)-a;
        } else if(k >= a) {
            ans = a;
        } else {
            ans = k;
        }
        System.out.println(ans);
    }
}