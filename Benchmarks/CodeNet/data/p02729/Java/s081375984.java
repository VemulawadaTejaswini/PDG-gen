import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 処理
        //n
        int np = 0;
        if ( n >= 2){
            for(int i = n - 1; i >= 1; i--){
                np += i;
            }
        }
        //m
        int mp = 0;
        if ( m >= 2){
            mp = 1;
            for(int i = m; i > 1; i--){
                mp *= i;
            }
            mp /= 2;
        }

        int out = np + mp;

        // 出力
        System.out.println(out);
    }
}