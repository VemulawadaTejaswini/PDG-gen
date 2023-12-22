import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    // 利子
    final static String INTEREST = "0.05";
    // 元金
    final static String INIT_LOAN = "100000";

    public static void main(String[] args) {
        // 入力値を一行分取得する。
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer inputNumber = null;
        try {
            inputNumber = Integer.valueOf(br.readLine());
        } catch (IOException e) {
            System.out.println("inputError" + e.getMessage());
        }

        BigDecimal interest = new BigDecimal(INTEREST);
        BigDecimal loan = new BigDecimal(INIT_LOAN);

        // n(入力値された値)年後の借金額を計算する。
        for (int i = 0; i < inputNumber; i++) {
            loan = loan.add(loan.multiply(interest));
            // 千円以下を切り上げ
            loan = loan.setScale(-3, BigDecimal.ROUND_UP);
        }
        System.out.println(loan.toBigInteger());
    }
}