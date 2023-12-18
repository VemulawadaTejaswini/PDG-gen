import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        
        long price1 = a * x + b * y;
        long price2 = a * Long.max(0, x - y) + 2 * c * y;
        long price3 = 2 * c * x + b * Long.max(0, y - x);
        long price4 = c * 2 * Long.max(x, y);
        
        long ans = Long.min(Long.min(Long.min(price4, price3), price2), price1);
        System.out.println(ans);
    }
}
