import java.util.*;
import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int b = 10;
        int c = 0;
        int count = 1;
        double x = 10d;
        double y = 7d;

        for (int a = 7;; count++) {
            c = ((int) (a * (Math.pow(b, count) - 1)) / (b - 1));
            if (c % n == 0) {
                System.out.println(count);
                break;
            } else if (n % 2 == 0) {
                System.out.println("-1");
                break;
            
            } else if(c > Math.pow(x,y)){
                System.out.println(n-1);
                break;
            }
        }

    }
}
