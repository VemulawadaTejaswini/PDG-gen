import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        long a = sc.nextLong();
        long b = sc.nextLong();

        // 処理
        long out = -1;
        for(int i = 1; i <= 100 * 100; i++){
            if((long)(i * 0.08) == a && (long)(i * 0.1) == b){
                out = i;
                break;
            }
        }

        // 出力
        System.out.println(out);
    }

}