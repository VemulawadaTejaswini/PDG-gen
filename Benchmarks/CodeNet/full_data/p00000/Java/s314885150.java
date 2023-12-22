/**
 * 0000：QQの解答
 * 
 * @author MS14A
 * @version 2015/06/21
 */
public class Main {

    /**
     * 九九を出力して終了する 但し、×記号の代わりに、小文字の x を使用する
     * 
     * @param args
     */
    public static void main(String[] args) {

        // 段数ごとに九九を出力
        for (int lineNumber = 1; lineNumber <= 9; ++lineNumber) {
            printMultiplicationTable(lineNumber);
        }
    }

    /**
     * 段数を受け取り、その段の九九を出力する。
     * 
     * @param lineNumber
     *            段数
     */
    private static void printMultiplicationTable(int lineNumber) {
        for (int rowNumber = 1; rowNumber <= 9; ++rowNumber) {
            System.out.println(String.valueOf(lineNumber) + "x"
                    + String.valueOf(rowNumber) + "="
                    + lineNumber * rowNumber);
        }
    }

}