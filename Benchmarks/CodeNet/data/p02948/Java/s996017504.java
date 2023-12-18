
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    static Map<Integer, List<Integer>> baMap = new TreeMap<>(Collections.reverseOrder());

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;
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
                Collections.sort(aList);
                baMap.put(b, aList);
            }

            if (i >= n) {
                break;
            }

            i++;

        }
        scanner.close();

        int result = 0;
        int day = 1;

        for (; day <= m; day++) {
            result = result + getPay(day);
        }

        System.out.println(result);
    }

    private static Integer getPay(Integer day) {
        for (Map.Entry<Integer, List<Integer>> entry : baMap.entrySet()) {
            List<Integer> aList = entry.getValue();
            for (int idx = 0; idx < aList.size(); idx++) {
                Integer a = aList.get(idx);
                if (a <= day) {
                    aList.remove(idx);
                    baMap.put(entry.getKey(), aList);
                    return entry.getKey();
                }
            }
        }
        return 0;
    }

}