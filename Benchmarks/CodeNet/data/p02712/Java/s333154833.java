import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();

        // 処理
        long out = 0;
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 || i % 5 == 0) {
                continue;
            } else {
                out += i;
            }
        }

        // 出力
        System.out.println(out);
    }

}