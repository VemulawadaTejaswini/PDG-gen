import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        String s = sc.next();
        int q = sc.nextInt();

        // 処理
        StringBuilder out = new StringBuilder(s);
        for(int i = 1; i <= q; i++){
            int t = sc.nextInt();
            if(t == 1){
                out = out.reverse();
            } else {
                int f = sc.nextInt();
                String c = sc.next();

                if(f == 1){
                    StringBuilder sb = new StringBuilder(c);
                    sb.append(out);
                    out = sb;
                } else {
                    out.append(c);
                }        
            }
        }

        // 出力
        System.out.println(out.toString());
    }
}