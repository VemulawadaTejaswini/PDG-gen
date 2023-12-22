import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
 
public class Main {
 
 
    public static void main(String[] args) throws IOException {
        // 宣言
        BigDecimal shakkin = new BigDecimal(100000);
        BigDecimal taxper = new BigDecimal(0.05);
        BigDecimal rishi;
        int output = 0;
 
        // 文字列の入力
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in), 1);
        int week = Integer.parseInt(input.readLine()); 
        //金額計算
        for (int i = 0; i <= week; i++) {
            // 5%の利子を計算する
            rishi = shakkin.multiply(taxper);
            // 5%の利子を元金に足す
            shakkin = shakkin.add(rishi);
        }
        // 1000円未満を切り上げる
        output = shakkin.setScale(-3, BigDecimal.ROUND_UP).intValue();
        System.out.println(output);
    }
}