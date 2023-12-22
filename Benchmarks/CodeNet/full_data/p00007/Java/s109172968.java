import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /** 週利 */
    private static final double INTEREST_WEEK = 0.05;

    /** 繰り上げ単位 */
    private static final int ROUND_UP_UNIT = 1000;

    /** 元金 */
    private static final int PRINCIPAL = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        int intInputWeek = Integer.parseInt(bufferedReader.readLine());

        // 借金計算
        double totalDebt = calcDebt(PRINCIPAL, intInputWeek);
        System.out.println((int) totalDebt);
    }

    /**
     * 借金計算メソッド（週利0.05%）
     * @param debt 現在の借金
     * @param week 現在の残り週
     * @return 借金額
     */
    private static double calcDebt(double debt, int week) {
        if (week == 0) {
            return debt;
        }
        debt *= 1 + INTEREST_WEEK;

        // 1000円未満は切り上げる
        double debtPlus = debt / ROUND_UP_UNIT - (int) (debt / ROUND_UP_UNIT);
        if (debtPlus > 0)
            debt = debt + ROUND_UP_UNIT - debtPlus * ROUND_UP_UNIT;

        return calcDebt(debt, --week);
    }

}