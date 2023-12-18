
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<Integer, List<Integer>> workMap = new HashMap<>();

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;

        int inputLineIdx = 1;
        while (true) {
            String inputText = scanner.nextLine();
            String[] inputTextArr = inputText.split(" ");

            if (inputLineIdx == 1) {
                n = Integer.parseInt(inputTextArr[0]);
                m = Integer.parseInt(inputTextArr[1]);
            } else {
                Integer day = Integer.valueOf(inputTextArr[0]);
                Integer pay = Integer.valueOf(inputTextArr[1]);

                List<Integer> payList = workMap.get(day);
                if (payList == null) {
                    payList = new ArrayList<>();
                }
                payList.add(pay);
                workMap.put(day, payList);
            }

            if (inputLineIdx == n + 1) {
                break;
            }

            inputLineIdx++;
        }
        scanner.close();


        List<Integer> pq = new ArrayList<>();

        int result = 0;
        for (int dayIdx = 1; dayIdx <= m; dayIdx++) {
            List<Integer> payList = workMap.get(dayIdx);
            if (payList != null && payList.size() > 0) {
                pq.addAll(payList);
            }

            if (pq != null && pq.size() > 0) {
                Integer maxValue = Collections.max(pq);
                result = result + maxValue;

                pq.remove(maxValue);
            }
        }

        System.out.println(result);
    }
}