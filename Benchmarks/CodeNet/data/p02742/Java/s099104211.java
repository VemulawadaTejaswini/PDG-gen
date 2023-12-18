import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();
        long ans = h * w;
        if (ans % 2 == 1)
            ans++;

        System.out.println(ans / 2);
    }
}
