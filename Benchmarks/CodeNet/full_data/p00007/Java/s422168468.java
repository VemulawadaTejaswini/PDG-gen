import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

    private static final double TAX = 1.05;

    /**
     * <p> [機能] n を入力したとき、n 週間後の借金の残高を出力し終了するプログラム。n は 100 以下。</p>
     * <p> [説明] 特になし。</p>
     * <p> [備考] 特になし。</p>
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        String week = new BufferedReader(new InputStreamReader(System.in)).readLine();

        int totalAmount = 100000;
        int i = Integer.parseInt(week);
        // 入力された数値分返済額を増額する。
        for (int count = 0; count < i; count++) {
            totalAmount = new BigDecimal(totalAmount * TAX).setScale(-3, BigDecimal.ROUND_UP).intValue();
        }
        // 返済額を出力する。
        System.out.println(totalAmount);
    }
}