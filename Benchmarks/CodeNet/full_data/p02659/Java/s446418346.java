import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.lang.Math;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力
        //String t = sc.next();
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        // 
        double seisu = a * Math.floor(b);
        double work = Math.floor(a * ((b * 100) - (Math.floor(b) * 100)) / 100);
        long out = (long)(seisu + work);

        // 出力
        System.out.println(out);
    }    
}
