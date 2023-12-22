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

        int cnt = 0;
        int caseNo = 0;
        while (inputDataList.size() > cnt
                && Integer.parseInt(inputDataList.get(cnt)) != 0) {
            caseNo++;
            int[] cloth = new int[Integer.parseInt(inputDataList.get(cnt)) + 1];
            cnt++;
            int treasure = Integer.parseInt(inputDataList.get(cnt));
            cnt++;
            cnt = steal(inputDataList, cnt, caseNo, cloth, treasure);
        }
    }

    private static int steal(List<String> inputDataList, int cnt, int caseNo,
            int[] cloth, int treasure) {

        for (int i = 0; i < treasure; i++) {
            String[] treasureData = inputDataList.get(cnt).split(",");
            cnt++;

            int value = Integer.parseInt(treasureData[0]);
            int weight = Integer.parseInt(treasureData[1]);

            for (int j = cloth.length - weight - 1; j >= 0; j--) {
                if ((j == 0 || cloth[j] > 0)
                        && cloth[j + weight] < cloth[j] + value) {
                    cloth[j + weight] = cloth[j] + value;
                }
            }
        }

        printResult(cloth, caseNo);

        return cnt;
    }

    private static void printResult(int[] cloth, int caseNo) {
        int minWeight = 0;

        for (int i = 1; i < cloth.length; i++) {
            if (cloth[i] > cloth[minWeight]) {
                minWeight = i;
            }
        }

        System.out.println("Case " + caseNo + ":");
        System.out.println(cloth[minWeight]);
        System.out.println(minWeight);
    }
}