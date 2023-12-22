import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力
        //final int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        // 処理
        String out = "Yes";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != t.charAt(i)){
                out = "No";
            }
        }

        // 出力
        System.out.println(out);
    }
}
