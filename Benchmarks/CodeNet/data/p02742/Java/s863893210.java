import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();
        long ans = 0;

        if (h % 2 == 1 && w % 2 == 1)
            ans = h * (w - 1)/2 + (h + 1) / 2;
        else {
            ans = h * w / 2;
        }

        System.out.println(ans);
    }
}
