import java.awt.*;
import java.util.*;

public class Main implements Runnable {

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
    }

    @Override
    public void run() {
        // write your code here
        Scanner sc = new Scanner(System.in);

        // abc61 c
        int n = sc.nextInt();
        int k = sc.nextInt();
        Point[] list = new Point[n];

        for (int i = 0; i < n; i++) {
            list[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(list, Comparator.comparingInt(a -> a.x));

        int count = 0;
        for (Point p: list
        ) {
            count += p.y;
            if (count >= k) {
                System.out.println(p.x);
                return;
            }
        }
    }
}