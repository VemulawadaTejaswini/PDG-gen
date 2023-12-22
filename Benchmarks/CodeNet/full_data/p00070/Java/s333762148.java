import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputDataList = new ArrayList<String>();
        String input = null;

        try {
            while((input = in.readLine()) != null) {
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
            int answer = cntNumber(Integer.parseInt(inputDataArray[0]), Integer.parseInt(inputDataArray[1]), -1);

            System.out.println(answer);
        }
    }

    private static int cntNumber(int n, int s, int prevNum) {
        //残り1個の場合
        if(n == 1) {
            if(s > prevNum && s < 10) {
                return 1;
            } else {
                return 0;
            }
        }

        int cnt = 0;
        //残り2個以上の場合
        for(int i = prevNum + 1; i < 10; i++) {
            cnt = cnt + cntNumber(n - 1, s - i, i);
        }

        return cnt;
    }
}