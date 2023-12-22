import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc    = new Scanner(System.in);
        long    a     = Long.parseLong(sc.next());
        double  max   = Math.sqrt(a);
        int     div   = 2;
        int     count = 0;
        // 2から割り切れるだけ割り切る
        while (true) {
            if (a == 1) {
                break;
            }

            if (div > max) {
                count++;
                break;
            }

            if (a % div == 0) {
                a = a / div;
                count++;
                //System.out.println("a: " + a + " count: " + count + " div: " + div);

                if (a == div) {
                    break;
                }
            }
            div++;
        }

        if (count == 0 && a != 1) {
            count = 1;
        }

        System.out.println(count);
    }
}
