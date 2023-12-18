import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();

        Point[] array = new Point[n];

        for (int i = 0; i < n; i++) {
            array[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(array, Comparator.comparingInt(v -> v.x));
        Point aMax = array[n - 1];
        Arrays.sort(array, (v1, v2) -> v2.y - v1.y);
        int count = 0;
        int index = 0;
        while (h > 0) {
            if (index < n && array[index].y >= aMax.x) {
                h -= array[index].y;
                index++;
                count++;
            } else {
                int decreased = h / aMax.x;
                if (h % aMax.x > 0) {
                    decreased++;
                }
                h -= aMax.x * decreased;
                count += decreased;
            }
        }
        System.out.println(count);
    }
}