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
                out = trans(out, f, c);
            }
        }

        // 出力
        System.out.println(out.toString());
    }

    public static StringBuilder trans(StringBuilder in, int f, String c){
        StringBuilder sb;
        if(f == 1){
            sb = new StringBuilder(c);
            sb.append(in);
        } else {
            sb = in;
            sb.append(c);
        }
        return sb;
    }
}