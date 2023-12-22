import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        //String s = sc.next();

        // 処理
        int out = 0;
        if(a >= k){
            out = k;
        } else {
            out = a;
            k -= a;
            if(b >= k){
                out = a;
            } else {
                out = a;
                k -= b;
                out -= k;
            }
        }

        // 出力
        System.out.println(out);
    }
}
