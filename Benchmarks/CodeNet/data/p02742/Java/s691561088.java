import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long w = sc.nextInt();
        long ans = h * w;
        if (ans != 1 && ans % 2 == 1)
            ans++;
        if (ans != 1)
            ans /= 2;
        System.out.println(ans);
    }
}
