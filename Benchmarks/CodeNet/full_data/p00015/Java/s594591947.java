import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

    // 本プログラムで扱える最大の桁数(80桁)
    private static final int LIMIT_NUM = 80;

    public static void main(String[] args) {

        List<String> inputDataList = new LinkedList<String>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = null;

        try {
            while ((input = in.readLine()) != null) {
                inputDataList.add(input);
            }

            int roopCnt = Integer.parseInt(inputDataList.get(0));

            for (int i = 1; i <= roopCnt; i++) {

                // 入力データ
                String inputData1 = inputDataList.get(i * 2 - 1);
                String inputData2 = inputDataList.get(i * 2);

                // 入力値が80ケタを超える場合、overflow確定
                if (inputData1.length() > LIMIT_NUM
                        || inputData2.length() > LIMIT_NUM) {
                    System.out.println("overflow");
                    continue;
                }

                // 計算用配列
                int[][] num = new int[3][LIMIT_NUM];

                stockNum(num, inputData1, 0);
                stockNum(num, inputData2, 1);

                addminNum(num);

                // 80桁目が10以上の場合、オーバーフロー確定
                if (num[2][LIMIT_NUM - 1] > 9) {
                    System.out.println("overflow");
                    continue;
                }

                StringBuilder printNum = new StringBuilder();

                makePrintNum(printNum, num[2]);

                System.out.println(printNum.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void stockNum(int[][] num, String inputData, int place) {

        int cnt = 0;

        for (int i = inputData.length() - 1; i >= 0; i--) {
            String tmp = inputData.substring(cnt, cnt + 1);
            num[place][i] = Integer.parseInt(tmp);
            cnt++;
        }
    }

    private static void addminNum(int[][] num) {
        for (int i = 0; i < LIMIT_NUM; i++) {

            num[2][i] = num[0][i] + num[1][i] + num[2][i];

            if (num[2][i] > 9 && i != LIMIT_NUM - 1) {
                num[2][i] = num[2][i] - 10;
                num[2][i + 1]++;
            }
        }
    }

    private static void makePrintNum(StringBuilder printNum, int[] num) {

        boolean flg = false;

        for (int i = num.length - 1; i >= 0; i--) {

            if (num[i] != 0 || flg) {
                flg = true;
                printNum.append(num[i]);
            }
        }
    }
}