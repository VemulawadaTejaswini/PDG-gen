import java.awt.Rectangle;
import java.util.Scanner;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int w = sc.nextInt();
            int h = sc.nextInt();
            
            int n = sc.nextInt();
            int num = 0;
            for (int j = 0; j < n; j++) {
                int xj = sc.nextInt();
                int yj = sc.nextInt();
                if (x <= xj && xj <= x + w && y <= yj && yj <= y + h) {
                    num++;
                }
            }
            System.out.println(num);
        }
    }

}