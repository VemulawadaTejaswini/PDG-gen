import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long ans = h;
        long tmp = h;
        for (long i = 0; tmp >=2; i++) {
            tmp /= 2;
            ans += Math.pow(2, i);
        }
        System.out.println(ans);
    }
}
