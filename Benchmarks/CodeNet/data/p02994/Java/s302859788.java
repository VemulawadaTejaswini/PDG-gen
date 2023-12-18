import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int t = l + i - 1;
            if (Math.abs(t) < Math.abs(min)) {
                min = t;
            }
            sum += t;
        }
        System.out.println(sum - min);
    }
}
