import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

/**
 * @author t.Tamegaya
 *
 *         2013/04/08
 */
public class Main {

    public static void main(String[] args) {

        List<String> inputDataList = new LinkedList<String>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // 入力データをリストにセット
        String inputData = null;
        try {
            while ((inputData = in.readLine()) != null) {
                inputDataList.add(inputData);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }

        for (String data : inputDataList) {
            double[] result = calculate(data);

            // 表示用のフォーマットに変更
            DecimalFormat resultFormat = new DecimalFormat();
            resultFormat.setMaximumFractionDigits(3);
            resultFormat.setMinimumFractionDigits(3);

            System.out.println(resultFormat.format(result[2]) + " "
                    + resultFormat.format(result[5]));
        }
    }

    private static double[] calculate(String data) {

        // 配列に変換
        String[] numberStr = data.split(" ");

        // 計算用の配列を用意
        double[] number = new double[6];

        for (int i = 0; i < number.length; i++) {
            number[i] = Double.parseDouble(numberStr[i]);
        }

        // aの値が0の場合、(a,b,c)と(d,e,f)を入れ替える。
        if (number[0] == 0) {
            temp(number);
        }

        // 1番目の式を計算
        divided(number, number[0], 0);

        // 2番目の式を調整
        substract(number, number[3], 3, 0);

        // 2番目の式を計算
        divided(number, number[4], 3);

        // 1番目の式を調整
        substract(number, number[1], 0, 3);

        return number;
    }

    private static void substract(double[] number, double sub, int from, int to) {

        for (int i = 0; i < 3; i++) {
            number[from + i] = number[from + i] - number[to + i] * sub;
        }
    }

    private static void divided(double[] number, double divided, int i) {

        for (int j = i; j < i + 3; j++) {
            number[j] = number[j] / divided;
        }
    }

    private static void temp(double[] number) {
        for (int i = 0; i > 3; i++) {
            double temp = number[i];
            number[i] = number[i + 3];
            number[i + number.length] = temp;
        }
    }
}