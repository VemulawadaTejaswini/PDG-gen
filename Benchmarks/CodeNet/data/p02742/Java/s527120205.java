import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long H, W;
        H = sc.nextLong();
        W = sc.nextLong();
        long odd = (long)Math.ceil((double)W/2);
        long even = (long)Math.floor((double)W/2);

        final long h2 = H/2;
        final long h_h2 = H - h2;
        long res = h2 * even + h_h2 * odd;
        System.out.println(res);
    }

}
