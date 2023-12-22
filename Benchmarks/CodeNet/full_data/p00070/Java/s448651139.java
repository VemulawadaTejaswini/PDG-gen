import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputDataList = new ArrayList<String>();
        String input = null;

        try {
            while ((input = in.readLine()) != null) {
                inputDataList.add(input);
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

        for (String inputData : inputDataList) {
            String[] inputDataArray = inputData.split(" ");
            int n = Integer.parseInt(inputDataArray[0]);
            boolean[] useNum = new boolean[10];

            int answer = cntNumber(n, Integer.parseInt(inputDataArray[1]),
                    useNum, 0);

            System.out.println(answer);
        }
    }

    private static int cntNumber(int n, int s, boolean[] useNum, int cnt) {

        if (n == 1) {
            if (s < 10 && !useNum[s]) {
                return 1;
            } else {
                return 0;
            }
        }

        int answer = 0;

        // 最大値をs/nにすることで計算結果がマイナスにならないよう調整
        for (int i = 0; i <= s / n && i < 10; i++) {

            // 番号使用中ならばスキップ
            if (useNum[i]) {
                continue;
            }

            // 番号使用中に設定
            useNum[i] = true;
            answer = answer + cntNumber(n - 1, s - i * n, useNum, cnt + 1);

            // 番号未使用に設定
            useNum[i] = false;
        }

        return answer;
    }
}