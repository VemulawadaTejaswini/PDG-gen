import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.math.BigDecimal;
import java.math.MathContext;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 処理
        String out = "No";

        BigDecimal aa = new BigDecimal(Math.sqrt(new BigDecimal(a).doubleValue()), MathContext.DECIMAL64);
        BigDecimal bb = new BigDecimal(Math.sqrt(new BigDecimal(b).doubleValue()), MathContext.DECIMAL64);
        BigDecimal cc = new BigDecimal(Math.sqrt(new BigDecimal(c).doubleValue()), MathContext.DECIMAL64);

        if (aa.add(bb).compareTo(cc) < 0){
            out = "Yes";
        }

        // 出力
        System.out.println(out);
    }
}