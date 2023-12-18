
import java.util.*;


/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Long a = scanner.nextLong();
        Long b = scanner.nextLong();

        if(a < b){
            Long temp = a;
            a = b;
            b = temp;
        }

        if(a % 3 == 0 || b % 3 == 0){
            System.out.println(0);
            return;
        }

        Long ans = 1999999999L;
        for (Long i = 1L; i <= a; i++) {
            Long tempa = b * (a - i);
            Long tempb = i * (b / 2l);
            Long tempc = a * b - tempa - tempb;
            Long max = Math.max(tempa, Math.max(tempb, tempc));
            Long min = Math.min(tempa, Math.min(tempb, tempc));
            ans = Math.min(ans, max - min);
        }
        System.out.println(ans);








    } // mainMethod


} // MainClass
