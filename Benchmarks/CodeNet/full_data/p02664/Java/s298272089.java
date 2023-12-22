import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.lang.Math;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力
        String t = sc.next();

        // 処理
        char[] out = new char[t.length()];
        for(int i = 0; i < t.length(); i++){
            if(i == 0 && t.charAt(0) == '?'){
                 out[0] = 'D';
                 continue;
            }
            if(t.charAt(i) == '?'){
                if(out[i-1] == 'P'){
                    out[i] = 'D';
                } else {
                    out[i] = 'P';
                }
            } else {
                out[i] = t.charAt(i);
            }
        }

        // 出力
        System.out.println(out);
    }    
}
