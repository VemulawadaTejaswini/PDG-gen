import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        //String s = sc.next();

        // 処理
        String out = "";
        while ( a > 0 && c > 0){
            c -= b;
            if ( c <= 0){
                out = "Yes";
                break;
            }
            a -= d;
            if ( a <= 0){
                out = "No";
                break;
            }
        }

        // 出力
        System.out.println(out);
    }
}