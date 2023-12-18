import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m1 = s.nextInt();
        int d1 = s.nextInt();
        int m2 = s.nextInt();
        int d2 = s.nextInt();
        int ans = 0;
        if (m1 + 1 == m2 && d2 == 1)
            ans = 1;
        System.out.println(ans);
    }
}
