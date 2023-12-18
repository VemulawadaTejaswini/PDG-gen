
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        double nn = Math.floor(n / (a+b) * 1.0);

        long blue = ((long)nn) * a;
        long red = ((long)nn) * b;

        if (blue + red + a <= n) blue += a;
        else blue += (n - (blue + red));

        System.out.println(blue);

    }
}