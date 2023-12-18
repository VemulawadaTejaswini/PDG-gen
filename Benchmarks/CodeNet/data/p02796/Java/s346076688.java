import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Point[] array = new Point[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int l = sc.nextInt() - 1;
            array[i] = new Point(x - l, x + l);
        }
        Arrays.sort(array, Comparator.comparingInt(k -> k.y));

        int ans = 1;

        int last = array[0].y;

        for (int i = 1; i < n; i++) {
            if (array[i].x > last) {
               last = array[i].y;
               ans++;
            }
        }

        System.out.println(ans);
    }
}