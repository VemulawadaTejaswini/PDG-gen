import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        String s = sc.next();
        int q = sc.nextInt();

        // 処理
        String out = s;
        for(int i = 1; i <= q; i++){
            int t = sc.nextInt();
            if(t == 1){
                out = rev(out);
            } else {
                int f = sc.nextInt();
                String c = sc.next();
                out = trans(out, f, c);
            }
        }

        // 出力
        System.out.println(out);
    }

    public static String rev(String in){
        StringBuilder sb = new StringBuilder(in);
        return sb.reverse().toString();
    }

    public static String trans(String in, int f, String c){
        StringBuilder sb = new StringBuilder();
        if(f == 1){
            sb.append(c);
            sb.append(in);
        } else {
            sb.append(in);
            sb.append(c);
        }
        return sb.toString();
    }
}