import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.lang.Math;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力
        int k = sc.nextInt();
        String s = sc.next();

        // 処理
        String out = "";
        if(s.length() <= k){
            out = s;
        } else {
            out = s.substring(0, k).concat("...");
        }

        // 出力
        System.out.println(out);
    }
}
