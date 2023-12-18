import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        // 処理
        String out = (Math.sqrt(a) + Math.sqrt(b) ) < Math.sqrt(c) ? "Yes" : "No";

        // 出力
        System.out.println(out);
    }
}