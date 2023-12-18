import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        String s = sc.next();

        // 処理
        String out = "No";

        int n = s.length();

        //sは回文か
        if(isKaibun(s)) {
            //sは強い回文か
            if(
                isKaibun(s.substring(0, (n - 1)/2)) &&
                isKaibun(s.substring((n + 3)/2 - 1, n))
            ) {
                out = "Yes";
            }
        }

        // 出力
        System.out.println(out);
    }

    // 0 1 2 4
    public static boolean isKaibun(String s){
        int len = s.length();
        for (int i = 0; i <= (len - 1) / 2; i++){
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}