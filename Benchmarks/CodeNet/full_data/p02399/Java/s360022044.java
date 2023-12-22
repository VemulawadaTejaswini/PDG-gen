import java.util.*;

public class Main{
    public static void main(String[] args){
        int a, b, d, r;
        double f;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        d = a / b;
        r = a % b;
        f = 1.0 * a / b;
        System.out.println(String.format("%d %d %.5f", d, r, f));
    }
}
