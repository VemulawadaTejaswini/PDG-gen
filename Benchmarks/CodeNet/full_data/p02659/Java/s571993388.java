import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        double a = sn.nextDouble();
        double b = sn.nextDouble();
        
        double num = a * b;
        double ans = 0;
        ans = Math.floor(num);
        
        System.out.println(String.format("%,.0f", ans));
    }
}
