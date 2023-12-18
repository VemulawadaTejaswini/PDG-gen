
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        double min = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < n; i++) {
            double diff =  Math.abs(a - Math.abs(t - (double )sc.nextInt() * 0.006));
            if (min > diff) {
                res = i;
                min = diff;
            }
        }
        System.out.println(res+1);
    }
}
