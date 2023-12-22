import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Math.abs(sc.nextLong());
        long k = sc.nextLong();
        long d = sc.nextLong();
        
        long straight = Math.min(k, x/d);
        long y = x - (straight * d);
        k -= straight;
        
        if (k > 0) {
            if (k%2 == 1) y = Math.abs(y - d);
        }

        System.out.println(y);
    }
}