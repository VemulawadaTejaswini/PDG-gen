import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long H, W;
        H = sc.nextLong();
        W = sc.nextLong();
        final long even = W/2;
        final long odd = W-even;

        final long h2 = H/2;
        final long h_h2 = H - h2;
        long res = h2 * even + h_h2 * odd;
        if(H == 1 || W == 1){
            System.out.println("1");
        }else {
            System.out.println(res);
        }
    }

}
