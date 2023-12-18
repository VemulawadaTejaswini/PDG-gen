import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;
        Map<Integer, List<Integer>> baMap = new TreeMap<>(Collections.reverseOrder());

        int i = 0;

        while (true) {
            String inputText = scanner.nextLine();
            String[] inputTextArr = inputText.split(" ");

            if (i == 0) {
                n = Integer.parseInt(inputTextArr[0]);
                m = Integer.parseInt(inputTextArr[1]);
            } else {
                Integer a = Integer.valueOf(inputTextArr[0]);
                Integer b = Integer.valueOf(inputTextArr[1]);

                List<Integer> aList = baMap.get(b);
                if (aList == null) {
                    aList = new ArrayList<>();
                }
                aList.add(a);
                baMap.put(b, aList);
            }

            if (i >= n) {
                break;
            }

            i++;

        }
        scanner.close();

        int result = 0;
        for (Map.Entry<Integer, List<Integer>> entry : baMap.entrySet()) {
            List<Integer> aList = entry.getValue();
            Collections.sort(aList, Collections.reverseOrder());
            for (Integer a : aList) {
                if (a <= m) {
                    result = result + entry.getKey();
                    m--;
                }
            }
        }
        System.out.println(result);
    }
}