import java.io.InputStream;
import java.util.Scanner;

/**
 * @author MS14A
 * @version 2017/03/06
 */
public class Main {

    private static final String RESULT_DRAW = "d";

    /**
     * メインメソッド
     *
     * @param args
     */
    public static void main(String[] args) {
        // ローカルテスト用。提出時は"System.in"に修正。
        InputStream input = System.in;
//        File input = new File("D:/Temp/AOJ/0066_TicTacToe.txt");

        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                System.out.println(judgeWinner(splitLine(scanner.nextLine())));
            }
        } catch (Exception e) {
            // 対応しない。
        }
    }

    private static String[] splitLine(String line) {
        String[] result = new String[line.length()];

        for (int i = 0; i < line.length(); i++) {
            result[i] = String.valueOf(line.charAt(i));
        }

        return result;
    }

    private static String judgeWinner(String[] line) {
        String result = null;
        // 縦のチェック
        result = checkVertical(line);

        if (result != null) {
            return result;
        }

        // 横のチェック
        result = checkHorizontal(line);
        if (result != null) {
            return result;
        }

        // 斜めのチェック
        result = checkDiagonal(line);
        if (result != null) {
            return result;
        }

        return RESULT_DRAW;
    }

    private static String checkVertical(String[] line) {

        for (int i = 0; i < 3; i++) {
            if (!"s".equals(line[i]) && line[i].equals(line[i + 3])
                    && line[i + 3].equals(line[i + 6])) {
                return line[0];
            }
        }

        return null;
    }

    private static String checkHorizontal(String[] line) {

        for (int i = 0; i < 9; i += 3) {
            if (!"s".equals(line[i]) && line[i].equals(line[i + 1])
                    && line[i + 1].equals(line[i + 2])) {
                return line[0];
            }
        }

        return null;
    }

    private static String checkDiagonal(String[] line) {
        if (!"s".equals(line[0]) && line[0].equals(line[4])
                && line[4].equals(line[8])) {
            return line[0];
        }

        if (!"s".equals(line[2]) && line[2].equals(line[4])
                && line[4].equals(line[6])) {
            return line[2];
        }

        return null;
    }
}