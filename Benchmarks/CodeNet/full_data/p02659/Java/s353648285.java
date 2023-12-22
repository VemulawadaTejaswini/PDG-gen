import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        
        long ib = (int)b;
        long db = (long)((b-ib) * 100);
        long ans = a*ib + a*db/100 ;
        System.out.println(ans);
    }
}