import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int x1 = x % 100;
        int x2 = x/ 100;
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        int count = 0;
        for (int i=5; i>0; i--) {
            while (x1 - i > 0) {
                x1 -= i;
                count ++;
            }
        }
        System.out.println(count > x2 ? 0 : 1);
    }
}