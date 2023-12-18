import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long w = sc.nextInt();
        long ans = h * w;
        if (h == 1 || w == 1) {
            ans = 1;
        }
        else {
            if (ans % 2 == 1)
                ans++;
            ans /= 2;
        }
        System.out.println(ans);
    }
}
