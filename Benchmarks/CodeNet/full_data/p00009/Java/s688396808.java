import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * 数値を受け取り、その数値以下の素数がいくつあるかを求める。
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {

        // 入力値をリストで受け取る
        List<Integer> inputList = readNumberList();

        // 必要な組み合わせ数のマップを作成する
        int maxInput = getMaxNumber(inputList);
        boolean[] primeMap = createPrimeMap(maxInput);

        // 結果を出力する
        printResult(inputList, primeMap);

    }

    /**
     * 標準入力から数値を読んでリストとして返却する。
     *
     * @return 入力された数値のリスト
     */
    protected static List<Integer> readNumberList() throws IOException {

        List<Integer> inputList = new ArrayList<Integer>();

        String line = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));
        while ((line = reader.readLine()) != null) {
            inputList.add(Integer.parseInt(line));
        }

        if (reader != null) {
            reader.close();
        }

        return inputList;
    }

    /**
     * 数値リストのうち最大の数値を取得する。
     *
     * @param inputList 数値リスト
     * @return 数値リスト内の最大の数値
     */
    protected static int getMaxNumber(List<Integer> inputList) {
        int maxInput = 0;
        for (Integer input : inputList) {
            if (maxInput < input) {
                maxInput = input;
            }
        }
        return maxInput;
    }

    /**
     * 指定された数値までの素数マップを作成する。
     *
     * @param max 基準となる数値
     * @return 基準値までの素数マップ
     */
    protected static boolean[] createPrimeMap(int max) {

        boolean[] primeMap = new boolean[max + 1];

        // マップを初期化（全て素数とする）
        for (int i = 0; i <= max; i++) {
            primeMap[i] = true;
        }

        // 0 と 1 は直接指定する
        primeMap[0] = false;
        primeMap[1] = false;

        // 最大値の平方根まで計算すればふるい落としは完了する
        int loopEnd = (int) Math.floor(Math.sqrt(max));
        for (int i = 2; i <= loopEnd; i++) {
            // 素数だったらその倍数をふるい落とす
            if (primeMap[i]) {
                for (int j = i * 2; j <= max; j += i) {
                    primeMap[j] = false;
                }
            }
        }

        return primeMap;
    }

    /**
     * 数値リストの数値ひとつひとつに対して、その数値以下の素数の数を求め、出力する。
     *
     * @param inputList 数値のリスト
     * @param primeMap 素数マップ
     */
    protected static void printResult(List<Integer> inputList, boolean[] primeMap) {
        for (int input : inputList) {
            System.out.println(getNumberOfPrime(input, primeMap));
        }
    }

    /**
     * 基準値までに素数がいくつあるかをカウントし、返却する。
     *
     * @param input 基準値
     * @param primeMap 素数マップ
     * @return 基準値までに素数がいくつあるか
     */
    protected static int getNumberOfPrime(int input, boolean[] primeMap) {
        int count = 0;
        for (int i = 0; i <= input; i++) {
            if (primeMap[i]) {
                count++;
            }
        }
        return count;
    }

}