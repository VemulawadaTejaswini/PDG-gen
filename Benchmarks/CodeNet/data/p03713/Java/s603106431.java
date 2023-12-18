
import java.util.*;


/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        if(a < b){
            long temp = a;
            a = b;
            b = temp;
        }

        if(a % 3 == 3 || b % 3 == 0){
            System.out.println(0);
            return;
        }

        long ans = 1999999999;
        for (int i = 1; i < a; i++) {
            long tempa = b * (a - i);
            System.out.println("a = " + tempa);
            long tempb = i * (b / 2);
            System.out.println("b = " + tempb);
            System.out.println();
                ans = Math.min(ans, Math.abs(tempa - tempb));
            }
        System.out.println(ans);







    } // mainMethod


} // MainClass
