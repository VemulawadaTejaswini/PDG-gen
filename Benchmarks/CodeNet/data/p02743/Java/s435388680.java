import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        // 主処理
        BigDecimal valA = new BigDecimal(Math.sqrt(a));
        BigDecimal valB = new BigDecimal(Math.sqrt(b));
        BigDecimal valC = new BigDecimal(Math.sqrt(c));
        BigDecimal valAB = valA.add(valB);
        boolean judge = 0 < valC.subtract(valAB).doubleValue();
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
