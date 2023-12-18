import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        if (n < m / 10000) {
            System.out.println("-1 -1 -1");
            return;
        }
        x = m / 10000;
        while (x >= 0) {
            y = n - x;
            while (y >= 0) {
                z = n - x - y;
                if (x * 10000 + y * 5000 + z * 1000 == m) {
                    System.out.println(x + " " + y + " " + z);
                    return;
                }
                y--;
            }
            x--;
        }
        System.out.println("-1 -1 -1");
    }

}
