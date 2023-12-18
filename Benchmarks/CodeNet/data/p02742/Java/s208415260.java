import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();
        long ans = 0;

        if (w% 2 == 0)
            ans = h * (w / 2);
        else {
            ans = h * ((w-1) / 2);
            if(h%2==0)
                ans += h / 2;
                else
                    ans += h / 2 + 1;

        }

        System.out.println(ans);
    }
}
